import com.raquo.laminar.api.L.*
import scala.meta.*
import com.raquo.airstream.web.WebStorageVar
import scala.util.Try

/** This component allows the user to select a particular scalameta Dialect,
  * persisting the selection in local storage.
  */
class DialectPicker():
  val (allowedDialects, serialise) =
    import scala.meta.dialects.*
    val l = List(
      "Scala 2.12" -> Scala212,
      "Scala 2.13" -> Scala213,
      "Scala 3" -> Scala3,
      "Scala 3 Future" -> Scala3Future,
      "SBT 1.x" -> Sbt1
    )

    (l, l.map(_.swap).toMap)
  end val

  /** Reactive variable containing currently selected dialect, either from local
    * storage or user-selected.
    */
  val dialectVar = WebStorageVar
    .localStorage(key = "scalameta-dialect", syncOwner = None)
    .withCodec[Dialect](
      serialise(_),
      a =>
        Try(
          allowedDialects
            .find(_._1 == a)
            .map(_._2)
            .getOrElse(scala.meta.dialects.Scala3)
        ),
      Try(scala.meta.dialects.Scala3)
    )

  /** Dialect picker component */
  val node = div(
    tw.flex.flex_row.gap_2.text_xs.mb_2,
    children <-- dialectVar.signal.map: current =>
      allowedDialects.map: (name, dialect) =>
        button(
          cls := (if dialect != current then {
            tw.cursor_pointer.bg_gray_200.hover(tw.bg_gray_300).rounded_md.px_2.py_1.text_xs.css
          } else {
            tw.bg_gray_800.rounded_md.px_2.py_1.text_xs.text_white.css
          }
        ),
        name,
        onClick.mapTo(dialect) --> dialectVar.writer
        )
  )
end DialectPicker
