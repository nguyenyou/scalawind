package myapp

import org.scalajs.dom

import scalawind.*

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._
@main
def App(): Unit =
  val container = dom.document.getElementById("app")

  ReactDOM.render(
    div(
      className := sw(tw.w_screen.h_screen.flex.items_center.justify_center),
      div(
        "Scala ❤️ Tailwind",
        className := sw(tw.p_2.text_primary.hover(tw.bg_black.text_white))
      )
    ),
    container
  )

end App
