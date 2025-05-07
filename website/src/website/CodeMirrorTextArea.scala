import com.raquo.laminar.api.L.*

import scalajs.js

/** This component attaches CodeMirror to a Laminar-managed <textarea> element,
  * and uses various CodeMirror event APIs to integrate with the rest of the
  * app. Most notable it will:
  *
  *   - Highlight a chunk of text in the editor that corresponds to the tree
  *     node user currently hovers on (by reacting to changes in {{hover}})
  *   - Continuously update the {{cursor}} Var based on the position reported by
  *     CodeMirror
  *
  * @param target
  *   the Var into which we will set the updated contents of the editor
  * @param cursor
  * @param hover
  * @param tv
  */
class CodeMirrorTextArea(
    target: Var[String],
    cursor: Var[CodeMirrorCursor],
    hover: Var[Option[Int]],
    tv: Signal[Option[TreeView]]
):
  private var instance = Option.empty[CodeMirrorInstance]
  private var marker = Option.empty[CodeMirrorMark]
  private val highlightText = hover.signal.combineWith(tv) --> {
    (hoverOpt, treeViewOpt) =>
      marker.foreach(_.clear())
      for
        treeview <- treeViewOpt
        hover <- hoverOpt
        inst <- instance
        tree <- treeview.getTree(hover)
      do
        marker = Some(
          inst.markText(
            js.Dynamic
              .literal(line = tree.pos.startLine, ch = tree.pos.startColumn),
            js.Dynamic
              .literal(line = tree.pos.endLine, ch = tree.pos.endColumn),
            js.Dynamic.literal(css =
              "background-color: rgba(255, 204, 0, 0.3);"
            )
          )
        )
      end for
  }

  val node = textArea(
    cls := "h-full",
    onInput.mapToValue --> target,
    value <-- target,
    highlightText,
    onMountCallback(el =>
      instance = Some(
        CodeMirror
          .fromTextArea(
            el.thisNode.ref,
            js.Dictionary(
              "value" -> target.now(),
              "lineNumbers" -> true,
              "mode" -> "text/x-scala"
            )
          )
      )

      instance
        .foreach(_.on("change", value => target.set(value.getValue())))

      instance.foreach(_.setSize("100%", "100%"))
      instance.foreach(
        _.on(
          "cursorActivity",
          codeMirrorInstance =>
            cursor.set(
              codeMirrorInstance.asInstanceOf[CodeMirrorInstance].getCursor()
            )
        )
      )
    )
  )
end CodeMirrorTextArea
