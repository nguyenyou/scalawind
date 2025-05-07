import com.raquo.laminar.api.L.*

import org.scalajs.dom
import scala.annotation.tailrec
import scala.meta.*
import com.raquo.airstream.core.Signal

case class TreeView(
    tree: Tree,
    textIndex: TextIndex,
    openNodes: Var[Set[Int]],
    cursor: Var[CodeMirrorCursor],
    hover: Var[Option[Int]]
):

  def getTree(id: Int): Option[Tree] =
    direct.get(id)

  lazy val node = div(
    tw.bg_gray_100.p_2.rounded_lg.shadow_md.w_full,
    deepestTreeUnderCursor --> pathToCursor,
    pathToCursor.signal.map(_.toSet) --> append,
    div(
      tw.flex.flex_row.gap_2.mb_2,
      a(
        href := "#",
        tw.bg_gray_200.hover(tw.bg_gray_300).rounded_md.px_2.py_1.text_xs,
        "collapse all",
        onClick.mapToStrict(Set.empty) --> openNodes,
        onClick.mapToStrict(List.empty) --> pathToCursor
      ),
      a(
        href := "#",
        tw.bg_gray_200.hover(tw.bg_gray_300).rounded_md.px_2.py_1.text_xs,
        "expand all",
        onClick.mapTo(direct.keySet) --> openNodes
      ),
      a(
        href := "#",
        tw.bg_gray_200.hover(tw.bg_gray_300).rounded_md.px_2.py_1.text_xs,
        "copy",
        onClick --> { _ =>
          openNodes.set(direct.keySet)
          dom.window.setTimeout(
            () => copyTreeStructure(reverse(tree)),
            0
          )
        }
      )
    ),
    code(encode(tree))
  )

  /** Copy tree */
  private def copyTreeStructure(id: Int): Unit =
    val treeOpt = direct.get(id)
    treeOpt.foreach { t =>
      val structure = generateTreeStructure(t, id)
      dom.window.navigator.clipboard.writeText(structure)
    }

  /** Copy tree starting from selected node */
  private def generateTreeStructure(
      t: Tree,
      currentId: Int,
      depth: Int = 0
  ): String =
    val prefix = "  " * depth
    val isExpanded = openNodes.now().contains(currentId)
    val hasChildren = t.children.nonEmpty
    val symbol =
      if hasChildren then (if isExpanded then "- " else "+ ") else "  "

    val nodeLine =
      s"$prefix$symbol${t.productPrefix} [${t.pos.start};${t.pos.end}]"

    if !hasChildren || !isExpanded then nodeLine
    else
      val childrenText = t.children
        .map { child =>
          val childId = reverse(child)
          generateTreeStructure(child, childId, depth + 1)
        }
        .mkString("\n")

      s"$nodeLine\n$childrenText"
    end if
  end generateTreeStructure

  /** Expand/collapse a single tree by its id */
  private val toggle = openNodes.updater[Int]: (cur, next) =>
    if cur(next) then cur - next else cur + next

  /** Helper to expand all trees with a given Set[Int] of tree ids */
  private val append = openNodes.updater[Set[Int]]: (cur, next) =>
    cur ++ next

  /** True if tree is expanded in the tree view */
  private def isToggled(id: Int) = openNodes.signal.map(_.contains(id))

  /** Represents the path from the root to the deepest tree that spans the
    * current cursor position
    */
  private val pathToCursor = Var(List.empty[Int])

  /** Monitor cursor position and find the deepest tree that spans the cursor
    * position, returning a reversed list of ancestors (deepest first) of that
    * tree.
    */
  private lazy val deepestTreeUnderCursor: Signal[List[Int]] =
    cursor.signal.map: cursor =>
      textIndex
        .posLookup(cursor.line, cursor.ch)
        .map: offset =>
          val deepest = intervalTree
            .resolve(offset)
            .sortBy: treeId =>
              offset - direct(treeId).pos.start

          deepest.headOption match
            case None => Nil
            case Some(value) =>
              @tailrec
              def go(id: Int, cur: List[Int]): List[Int] =
                direct.get(id).flatMap(_.parent).flatMap(reverse.get) match
                  case None         => cur
                  case Some(parent) => go(parent, parent :: cur)

              go(value, List(value)).reverse
          end match
        .getOrElse(Nil)

  private lazy val (
    /** Map from tree id to tree */
    direct,
    /** Map from tree to id */
    reverse
  ) = index(tree)

  private lazy val intervalTree = IntervalTree.construct(reverse.map:
    (tree, id) => OffsetRange(tree.pos.start, tree.pos.end) -> id)

  /** Recursively create DOM tree structure that represents the Scalameta tree.
    *
    * TODO: Make this tail recursive.
    */
  private def encode(t: Tree): Element =
    val id = reverse(t)
    span(
      tw.group,
      span(
        cls <-- pathToCursor.signal.map(p =>
          if p.headOption.contains(id) then tw.bg_amber_500.css
          else if p.contains(id) then tw.bg_amber_100.css
          else ""
        ),
        a(
          tw.text_blue_700.text_sm,
          href := "#",
          child.text <-- isToggled(id).map: b =>
            val moniker =
              if t.children.isEmpty then "  " else if b then "- " else "+ "
            moniker + t.productPrefix
          ,
          onClick.preventDefault.mapToStrict(id) --> toggle,
          onMouseOver.mapToStrict(id) --> hover.someWriter,
          onMouseOut.mapToStrict(None) --> hover
        ),
        " ",
        i(
          tw.text_amber_700.text_xs.font_mono,
          s"[${t.pos.start};${t.pos.end}]"
        )
      ),
      if t.children.nonEmpty then
        a(
          tw.ml_2.text_gray_500.hover(tw.text_gray_700).text_xs.opacity_0.group_hover(tw.opacity_100).transition_opacity.cursor_pointer,
          title := "Copy node structure",
          "[copy]",
          onClick.preventDefault --> { _ =>
            openNodes.update(_ + id)
            dom.window.requestAnimationFrame { _ =>
              copyTreeStructure(id)
            }
          }
        )
      else emptyNode,
      ul(
        tw.list_inside.list_none.ml_4,
        t.children.map(child => li(encode(child))),
        display <-- openNodes.signal
          .map(_.contains(id))
          .map(if _ then "block" else "none")
      )
    )
  end encode

  /** Index every tree with a numeric identifier */
  private def index(t: Tree): (Map[Int, Tree], Map[Tree, Int]) =
    def go(
        next: Seq[Tree],
        n: Int,
        direct: Map[Int, Tree],
        reverse: Map[Tree, Int]
    ): (Map[Int, Tree], Map[Tree, Int]) =
      if next.isEmpty then (direct, reverse)
      else
        val ids = next.zipWithIndex.map { case (tree, idx) =>
          (n + idx) -> tree
        }.toMap
        val reverseIds = ids.map(_.swap).toMap
        go(
          next.flatMap(_.children),
          n + ids.size,
          direct ++ ids,
          reverse ++ reverseIds
        )
    end go
    go(Seq(t), 0, Map.empty, Map.empty)
  end index
end TreeView
