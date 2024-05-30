package myapp

import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*

import scala.scalajs.js
import scala.scalajs.js.annotation.*
import scalawind.*

object IndexPage {
  private def render() =
    ScalaFnComponent
      .withHooks[Unit]
      .useState(0)
      .render((props, count) =>
        <.div(
          ^.cls := sw(
            tw.grid.items_center.justify_items_center.min_h_screen.p_8.pb_20.gap_16
              .sm(tw.p_20)
          ),
          <.main(
            ^.cls := sw(
              tw.flex.flex_col.gap_8.row_start_2.items_center.sm(tw.items_start)
            ),
            <.img(
              ^.cls := sw(tw.dark(tw.invert)),
              ^.src := "/next.svg",
              ^.alt := "Next.js logo",
              ^.width := "180px",
              ^.height := "38px"
            ),
            <.ol(
              ^.cls := sw(
                tw.font_mono.list_inside.list_decimal.text_sm.text_center
                  .sm(tw.text_left)
              ),
              <.li(
                ^.cls := sw(tw.mb_2),
                "Get started by editing ",
                <.code(
                  ^.cls := sw(
                    tw.bg_black
                      .dark(tw.bg_gray_700)
                      .px_1
                      .rounded
                      .font_semibold
                  ),
                  "pages/index.js"
                )
              ),
              <.li(
                "Save and see your changes instantly."
              )
            ),
            <.div(
              ^.cls := sw(
                tw.font_sans.flex.gap_4.items_center.flex_col.sm(tw.flex_row)
              ),
              <.a(
                ^.href := "#",
                ^.cls := sw(
                  tw.rounded_full.border.border_solid.border_transparent.transition_colors.flex.items_center.justify_center.bg_foreground.text_background.gap_2.text_sm
                    .sm(tw.text_base.h_10.px_5)
                    .h_10
                    .px_4
                ),
                <.img(
                  ^.cls := sw(tw.dark(tw.invert)),
                  ^.src := "/vercel.svg",
                  ^.alt := "Vercel logomark",
                  ^.height := "20px",
                  ^.width := "20px"
                ),
                "Deploy now"
              ),
              <.a(
                ^.href := "#",
                ^.cls := sw(
                  tw.rounded_full.border.border_solid.border_black
                    .dark(tw.border_neutral_700)
                    .transition_colors
                    .flex
                    .items_center
                    .justify_center
                    .text_sm
                    .sm(tw.text_base.h_12.px_5.min_w_44)
                    .h_10
                    .px_4
                ),
                "Read our docs"
              )
            )
          ),
          <.footer(
            ^.cls := sw(
              tw.font_sans.row_start_3.flex.gap_6.flex_wrap.items_center.justify_center
            ),
            <.a(
              ^.cls := sw(
                tw.flex.items_center.gap_2
                  .hover(tw.underline.underline_offset_4)
              ),
              <.img(
                ^.src := "/file-text.svg",
                ^.cls := "File icon",
                ^.width := "16px",
                ^.height := "16px"
              ),
              "Learn"
            ),
            <.a(
              ^.cls := sw(
                tw.flex.items_center.gap_2
                  .hover(tw.underline.underline_offset_4)
              ),
              <.img(
                ^.src := "/window.svg",
                ^.cls := "Window icon",
                ^.width := "16px",
                ^.height := "16px"
              ),
              "Examples"
            ),
            <.a(
              ^.cls := sw(
                tw.flex.items_center.gap_2
                  .hover(tw.underline.underline_offset_4)
              ),
              <.img(
                ^.src := "/globe.svg",
                ^.cls := "Globe icon",
                ^.width := "16px",
                ^.height := "16px"
              ),
              "Go to nextjs.org →"
            )
          )
        )
      )

  private val scalaComponent = ScalaComponent
    .builder[Unit](getClass.getSimpleName)
    .render_(render()())
    .build

  @JSExportTopLevel(name = "Component", moduleID = "index")
  val component = scalaComponent.toJsComponent.raw
}
