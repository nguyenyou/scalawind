package scalawind

import utest.*
import io.github.nguyenyou.scalawind.*

object ScalawindTests extends TestSuite {
  val tests = Tests {
    test("simple") {
      test("normal") {
        assert(tw.flex.items_center.justify_center.css == "flex items-center justify-center")
        assert(tw.bg_blue_500.text_white.rounded.py_3.px_4.css == "bg-blue-500 text-white rounded py-3 px-4")
      }
      test("modifier") {
        assert(tw.hover(tw.text_red_500).css == "hover:text-red-500")
      }
      test("arbitrary values") {
        assert(tw.text_("#ff0").css == "text-[#ff0]")
      }
      test("dot values") {
        assert(tw.`w_1.5`.css == "w-1.5")
      }
      test("percentage values") {
        assert(tw.`w_1/2`.css == "w-1/2")
      }
      test("negative values") {
        assert(tw._left_1.css == "-left-1")
      }
      test("raw values") {
        assert(tw.raw("text-green-400").css == "text-green-400")
      }
      test("important modifier") {
        assert(tw.important(tw.text_red_400).css == "!text-red-400")
      }
      test("color opacity") {
        assert(tw.text_red_400$("10").css == "text-red-400/10")
        assert(tw.bg_black$("[.05]").css == "bg-black/[.05]")
      }
      test("responsive design") {
        assert(tw._2xl(tw.text_black).css == "2xl:text-black")
        assert(tw.md(tw.text_black).css == "md:text-black")
      }
    }
    test("complex chaining") {
        test("stacked modifiers") {
            assert(tw.md(tw.hover(tw.text_red_500)).css == "md:hover:text-red-500")
            assert(tw.bg_blue_500.hover(tw.bg_blue_600).first_letter(tw.text_red_500.font_bold).text_white.rounded.py_3.px_4.md(tw.py_4.px_5).dark(tw.bg_sky_900.hover(tw.bg_sky_800)).css == "bg-blue-500 hover:bg-blue-600 first-letter:text-red-500 first-letter:font-bold text-white rounded py-3 px-4 md:py-4 md:px-5 dark:bg-sky-900 dark:hover:bg-sky-800")
        }
        test("arbitrary values") {
            assert(tw.flex.text_("#ff0").items_center.bg_("#00f").css == "flex text-[#ff0] items-center bg-[#00f]")
            assert(tw.text_("20px").py_3.px_4.bg_blue_500.css == "text-[20px] py-3 px-4 bg-blue-500")
        }
        test("important modifier") {
            assert(tw.sm(tw.hover(tw.important(tw.font_bold))).css == "sm:hover:!font-bold")
            assert(tw.important(tw.text_red_400).hover(tw.important(tw.text_red_600)).css == "!text-red-400 hover:!text-red-600")
        }
        test("arbitrary variant") {
            assert(tw.lg(tw.variant("&:nth-child(3)", tw.hover(tw.underline))).css == "lg:[&:nth-child(3)]:hover:underline")
            assert(tw.variant("&:nth-child(3)", tw.underline).list_disc.mx_5.text_white.css == "[&:nth-child(3)]:underline list-disc mx-5 text-white")
            assert(tw.variant("&:nth-child(3)", tw.underline.flex).list_disc.mx_5.text_white.css == "[&:nth-child(3)]:underline [&:nth-child(3)]:flex list-disc mx-5 text-white")
        }
        test("dot values, percentage values") {
            assert(tw.`w_1/2`.`h_1.5`._left_1.css == "w-1/2 h-1.5 -left-1")
            assert(tw.md(tw.hover(tw.`w_1/2`.`h_1.5`._left_1)).css == "md:hover:w-1/2 md:hover:h-1.5 md:hover:-left-1")
        }
        test("color opacity") {
            assert(tw.text_red_400$("10").bg_green_500$("20").css == "text-red-400/10 bg-green-500/20")
            assert(tw.font_bold.text_red_400$("10").bg_green_500$("20").hover(tw.text_black).css == "font-bold text-red-400/10 bg-green-500/20 hover:text-black")
            assert(tw.bg_blue_500$("25").text_white.rounded.py_3.px_4.css == "bg-blue-500/25 text-white rounded py-3 px-4")
        }
    }
    test("create next app") {
        test("index page") {
          assert(tw.flex.css == "flex")

          assert(
            tw.font_sans.grid
              .grid_rows_("20px_1fr_20px")
              .items_center
              .justify_items_center
              .min_h_screen
              .p_8
              .pb_20
              .gap_16
              .sm(tw.p_20).css == "font-sans grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20"
          )

          assert(
            tw.flex.flex_col.gap_8.row_start_2.items_center.sm(tw.items_start).css == "flex flex-col gap-8 row-start-2 items-center sm:items-start"
          )

          assert(
            tw.dark(tw.invert).css == "dark:invert"
          )

          assert(
            tw.font_mono.list_inside.list_decimal.text_sm.text_center.sm(tw.text_left).css == "font-mono list-inside list-decimal text-sm text-center sm:text-left"
          )

          assert(
            tw.bg_black$("[.05]").dark(tw.bg_white$("[.06]")).px_1.`py_0.5`.rounded.font_semibold.css == "bg-black/[.05] dark:bg-white/[.06] px-1 py-0.5 rounded font-semibold"
          )

          assert(
            tw.flex.gap_4.items_center.flex_col.sm(tw.flex_row).css == "flex gap-4 items-center flex-col sm:flex-row"
          )

          extension (tw: Tailwind) {
            def bg_foreground = tw
            def text_background = tw
          }

          assert(
            tw.rounded_full.border.border_solid.border_transparent.transition_colors.flex.items_center.justify_center.bg_foreground.text_background.gap_2
              .hover(tw.bg_("#383838"))
              .dark(tw.hover(tw.bg_("#333")))
              .text_sm
              .sm(tw.text_base)
              .h_10
              .sm(tw.h_12)
              .px_4
              .sm(tw.px_5).css == "rounded-full border border-solid border-transparent transition-colors flex items-center justify-center bg-foreground text-background gap-2 hover:bg-[#383838] dark:hover:bg-[#333] text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5"
          )

          assert(
            tw.rounded_full.border.border_solid
              .border_black$("[.08]")
              .dark(tw.border_white$("[.145]"))
              .transition_colors
              .flex
              .items_center
              .justify_center
              .hover(tw.bg_("#f2f2f2"))
              .dark(tw.hover(tw.bg_("#1a1a1a")))
              .hover(tw.border_transparent)
              .text_sm
              .sm(tw.text_base)
              .h_10
              .sm(tw.h_12)
              .px_4
              .sm(tw.px_5.min_w_44).css == "rounded-full border border-solid border-black/[.08] dark:border-white/[.145] transition-colors flex items-center justify-center hover:bg-[#f2f2f2] dark:hover:bg-[#1a1a1a] hover:border-transparent text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5 sm:min-w-44"
          )

          assert(
            tw.row_start_3.flex.gap_6.flex_wrap.items_center.justify_center.css == "row-start-3 flex gap-6 flex-wrap items-center justify-center"
          )

          assert(
            tw.flex.items_center.gap_2.hover(tw.underline.underline_offset_4).css == "flex items-center gap-2 hover:underline hover:underline-offset-4"
          )
        }
    }
  }
}