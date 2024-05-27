package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*
import scalawind.*


@main
def App(): Unit =
  val container = dom.document.getElementById("app")
  val styles: String = tw.w_screen.h_screen.flex.items_center.justify_center
  println(styles)
  render(
    container,
    div(
      cls := sw(tw.w_screen.h_screen.flex.items_center.justify_center),
      div(
        "Scala ❤️ Tailwind",
        cls := sw(tw.p_2.text_primary.hover(tw.bg_black.text_white))
      )
    )
  )
end App
