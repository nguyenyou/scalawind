package myapp

import org.scalajs.dom

import scalawind.*
import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*

@main
def main(): Unit =
  val container = dom.document.getElementById("app")

  val Component = ScalaFnComponent
    .withHooks[Unit]
    .useState(0)
    .render((props, count) => {
      <.div(
        clx(tw.w_screen.h_screen.flex.items_center.justify_center),
        <.div(
          clx(tw.p_2.text_primary.hover(tw.bg_black.text_white)),
          "Scala ❤️ Tailwind"
        )
      )
    })

  ReactDOMClient.createRoot(container).render(Component())

end App
