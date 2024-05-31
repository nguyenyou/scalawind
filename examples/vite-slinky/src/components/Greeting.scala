package myapp.components

import slinky.core.*
import slinky.web.html.*
import slinky.core.facade.Hooks.useState
import org.scalajs.dom
import org.scalajs.dom.{html, Event}

case class Greeting(
    name: String
) {
  def apply() = Greeting.component(this)
}

object Greeting {

  type Props = Greeting

  val component: FunctionalComponent[Props] = FunctionalComponent[Props] {
    props =>
      val (count, setCount) = useState(1)
      val (text, setText) = useState("John Doe")

      def handleClick(e: SyntheticEvent[html.Button, Event]) = {
        val newCount = count + 1
        setCount(newCount)
      }
      def handleChangeText(e: SyntheticEvent[html.Input, Event]) = {
        val newValue = e.target.value
        setText(newValue)
      }

      div(
        div(s"Hello, ${props.name}"),
        div(s"Counter: ${count}"),
        button(
          "Click me",
          onClick := (handleClick(_))
        ),
        div(s"Hi, ${text}"),
        div(
          input(
            value := text,
            onChange := (handleChangeText(_))
          )
        )
      )
  }
}
