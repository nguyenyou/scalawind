import scalawind.*

@main def integration() = {
  val styles: String = sw(
    tw.hover(tw.text_red_500)
  )
  println(styles)
}
