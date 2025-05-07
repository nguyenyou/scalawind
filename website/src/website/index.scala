import com.raquo.airstream.web.WebStorageVar
import com.raquo.laminar.api.L.*
import org.scalajs.dom

import scala.meta.*
import scala.util.Try
import scala.meta.parsers.Parsed

@main def hello =
  val openNodes = WebStorageVar
    .localStorage(key = "scalameta-openNodes", syncOwner = None)
    .withCodec[Set[Int]](
      _.mkString(","),
      a =>
        Try(
          a.split(',').flatMap(_.toIntOption).toSet
        ),
      Try(Set.empty)
    )

  val codeVar = WebStorageVar
    .localStorage(key = "scalameta-code", syncOwner = None)
    .text(SampleCode)
  val cursorVar = Var(CodeMirrorCursor(0, 0))
  val hoverVar = Var(Option.empty[Int])
  val treeViewVar = Var(Option.empty[TreeView])
  val errorVar = Var(Option.empty[Parsed.Error])
  val dialectPicker = DialectPicker()

  def parse(s: String, dialect: Dialect): Either[Parsed.Error, TreeView] =
    dialect
      .apply(s)
      .parse[scala.meta.Source]
      .toEither
      .map(tree =>
        TreeView(
          tree,
          TextIndex.construct(s),
          openNodes,
          cursorVar,
          hoverVar
        )
      )
  end parse

  val parsed =
    codeVar.signal.combineWith(dialectPicker.dialectVar.signal).map(parse)

  // TODO: stop using options and just do Either
  val updateTreeView =
    parsed.map(_.toOption) --> treeViewVar.writer

  val updateError =
    parsed.map(_.left.toOption) --> errorVar.writer

  val resultNode =
    treeViewVar.signal
      .combineWith(errorVar)
      .map:
        case (None, Some(err)) =>
          p(
            cls := "text-wrap text-sm bg-red-200 text-red-800 p-4 font-bold rounded-md",
            err.toString
          )
        case (Some(tv), None) => tv.node
        case _                => emptyNode

  val halfsplit =
    Seq(cls := "lg:w-6/12 h-full md:w-full")

  val textEditor =
    CodeMirrorTextArea(
      codeVar,
      cursorVar,
      hoverVar,
      treeViewVar.signal
    )

  val app =
    div(
      updateTreeView,
      updateError,
      cls := "content mx-auto my-4 w-10/12 bg-white/70 p-6 rounded-xl flex flex-col gap-4 min-h-150",
      div(
        cls := "flex items-center gap-4",
        img(src := "https://scalameta.org/img/scalameta.png", cls := "h-12"),
        h1("Scala AST explorer", cls := "text-4xl font-bold")
      ),
      header,
      dialectPicker.node,
      div(
        cls := "flex flex-col xs:flex-col md:flex-col sm:flex-col lg:flex-row xl:flex-row 2xl:flex-row  justify-baseline gap-4 w-full",
        div(
          halfsplit,
          textEditor.node
        ),
        div(halfsplit, p(code(pre(child <-- resultNode))))
      )
    )

  renderOnDomContentLoaded(dom.document.getElementById("app"), app)
end hello

val basicLink =
  cls := "text-emerald-800 hover:no-underline underline"

val header = div(
  cls := "flex flex-row gap-4 place-content-between w-full",
  p(
    cls := "text-md",
    "Explore the AST of Scala code"
  ),
  p(
    cls := "text-sm",
    a(
      "Github",
      href := "https://github.com/scalameta/ast-explorer",
      basicLink
    ),
    " | ",
    a(
      "Scalameta",
      href := "https://scalameta.org",
      basicLink
    ),
    " | ",
    a(
      "Scala.js",
      href := "https://scala-js.org",
      basicLink
    ),
    " | ",
    a(
      "Laminar",
      href := "https://laminar.dev",
      basicLink
    )
  )
)

val SampleCode =
  """
object X:
  class Test(a: Int):
    def hello = 25
"""
