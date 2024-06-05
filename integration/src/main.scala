import scalawind.*

@main def integration() = {
  val styles: String = sw(
    tw.rounded_full.border.border_solid.border_transparent.transition_colors.flex.items_center.justify_center.bg_foreground.text_background.gap_2
      .hover(tw.bg_("#383838"))
      .dark(tw.hover(tw.bg_("#333")))
      .text_sm
      .sm(tw.text_base)
      .h_10
      .sm(tw.h_12)
      .px_4
      .sm(tw.px_5)
  )
  println(styles)
}
