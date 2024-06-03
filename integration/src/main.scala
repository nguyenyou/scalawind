import scalawind.*

@main def integration() = {
  val styles: String = sw(tw.flex.text_("#ff0").items_center.bg_("#00f"))
  println(styles)
}
