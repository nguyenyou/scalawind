package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*
import be.doeraene.webcomponents.ui5.*
import be.doeraene.webcomponents.ui5.configkeys.*

@main
def main(): Unit = {
  val container = dom.document.getElementById("app")
  render(
    container,
    div(
      ThemeSelector(),
      Button(_.design := ButtonDesign.Default, "Default")
    )
  )
}
