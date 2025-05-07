import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait CodeMirrorValue extends js.Object:
  def getValue(): String

@js.native
trait CodeMirrorMark extends js.Object:
  def clear(): this.type = js.native

@js.native
trait CodeMirrorInstance extends js.Object:
  def on(
      eventName: String,
      listener: js.Function1[CodeMirrorValue, Unit]
  ): Unit = js.native

  def setSize(width: String, height: String): this.type = js.native

  def markText(from: js.Any, to: js.Any, options: js.Any): CodeMirrorMark =
    js.native
  def getCursor(): CodeMirrorCursor = js.native
end CodeMirrorInstance

@js.native
trait CodeMirrorCursor extends js.Object:
  def line: Int = js.native
  def ch: Int = js.native

object CodeMirrorCursor:
  def apply(line: Int, ch: Int): CodeMirrorCursor =
    js.Dynamic.literal(line = line, ch = ch).asInstanceOf[CodeMirrorCursor]

@js.native
@JSGlobal
object CodeMirror extends js.Object:
  def fromTextArea(
      element: dom.HTMLElement,
      options: js.Any
  ): CodeMirrorInstance =
    js.native
end CodeMirror
