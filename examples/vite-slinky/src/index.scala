package myapp

import org.scalajs.dom

import scalawind.*

import slinky.core.*
import slinky.core.facade.Hooks.*
import slinky.web.ReactDOM
import slinky.web.html.*

val Counter = FunctionalComponent[Int] { props =>
  val (count, setCount) = useState(props)
  div(
    className := tw.h_screen.w_screen.flex.items_center.justify_center,
    button(
      className := tw.bg_slate_900
        .hover(tw.bg_slate_700)
        .focus(
          tw.outline_none.ring_2.ring_slate_400.ring_offset_2.ring_offset_slate_50
        )
        .text_white
        .font_semibold
        .h_12
        .px_6
        .rounded_lg
        .w_full
        .flex
        .items_center
        .justify_center
        .sm(tw.w_auto)
        .dark(tw.bg_sky_500.hover(tw.bg_sky_400)),
      s"Counter: ${count}",
      onClick := (e => {
        val newCount = count + 1
        setCount(newCount)
      })
    )
  )
}

@main
def App(): Unit =
  val container = dom.document.getElementById("app")

  ReactDOM.render(Counter(2024), container)
