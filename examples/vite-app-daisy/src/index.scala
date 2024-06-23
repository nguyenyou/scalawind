package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*
import scalawind.*

@main
def App(): Unit =
  val container = dom.document.getElementById("app")
  render(
    container,
    div(
      button(
        tw.btn.btn_primary,
        "Click me"
      )
    )
  )
end App
