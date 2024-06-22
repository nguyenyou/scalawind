package myapp

import org.scalajs.dom

import scalawind.*
import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*

@main
def App(): Unit =
  val container = dom.document.getElementById("app")

  val Component = ScalaFnComponent
    .withHooks[Unit]
    .useState(0)
    .render((props, count) => {
      <.div(
        ^.cls := tw.w_screen.h_screen.flex.items_center.justify_center.css,
        <.div(
          ^.cls := tw.p_2.text_primary.hover(tw.bg_black.text_white).css,
          "Scala ❤️ Tailwind"
        )
      )
    })

  ReactDOMClient.createRoot(container).render(Component())

end App
