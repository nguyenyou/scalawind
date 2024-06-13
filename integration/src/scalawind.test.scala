//> using test.dep org.scalameta::munit::1.0.0
package tests.only

import scalawind.*

class SimpleSingleTests extends munit.FunSuite {
  test("normal") {
    assert(
      sw(
        tw.flex.items_center.justify_center
      ) == "flex items-center justify-center"
    )
    assert(
      sw(
        tw.bg_blue_500.text_white.rounded.py_3.px_4
      ) == "bg-blue-500 text-white rounded py-3 px-4"
    )
  }
  test("modifier") {
    assert(
      sw(
        tw.hover(tw.text_red_500)
      ) == "hover:text-red-500"
    )
  }
  test("modifier md") {
    assert(
      sw(
        tw.md(tw.text_red_500)
      ) == "md:text-red-500"
    )
  }
  test("arbitrary values") {
    assert(
      sw(
        tw.text_("#ff0")
      ) == "text-[#ff0]"
    )
  }
  test("dot values") {
    assert(
      sw(
        tw.w_1dot5
      ) == "w-1.5"
    )
  }
  test("percentage values") {
    assert(
      sw(
        tw.w_1per2
      ) == "w-1/2"
    )
  }
  test("negative values") {
    assert(
      sw(
        tw._left_1
      ) == "-left-1"
    )
  }
  test("raw values") {
    assert(
      sw(
        tw.raw("text-green-400")
      ) == "text-green-400"
    )
  }
  test("important modifier") {
    assert(
      sw(
        tw.important(tw.text_red_400)
      ) == "!text-red-400"
    )
  }
  test("color opacity") {
    assert(
      sw(
        tw.text_red_400$("10")
      ) == "text-red-400/10"
    )
    assert(
      sw(
        tw.bg_black$("[.05]")
      ) == "bg-black/[.05]"
    )
  }

  test("responsive design") {
    assert(
      sw(
        tw._2xl(tw.text_black)
      ) == "2xl:text-black"
    )

    assert(
      sw(
        tw.md(tw.text_black)
      ) == "md:text-black"
    )
  }
}

class ComplexChainingTests extends munit.FunSuite {
  test("stacked modifiers") {
    assert(sw(tw.md(tw.hover(tw.text_red_500))) == "md:hover:text-red-500")
    assert(
      sw(
        tw.bg_blue_500
          .hover(tw.bg_blue_600)
          .first_letter(tw.text_red_500.font_bold)
          .text_white
          .rounded
          .py_3
          .px_4
          .md(tw.py_4.px_5)
          .dark(tw.bg_sky_900.hover(tw.bg_sky_800))
      ) == "bg-blue-500 hover:bg-blue-600 first-letter:text-red-500 first-letter:font-bold text-white rounded py-3 px-4 md:py-4 md:px-5 dark:bg-sky-900 dark:hover:bg-sky-800"
    )
  }
  test("arbitrary values") {
    assert(
      sw(
        tw.flex.text_("#ff0").items_center.bg_("#00f")
      ) == "flex text-[#ff0] items-center bg-[#00f]"
    )
    assert(
      sw(
        tw.text_("20px").py_3.px_4.bg_blue_500
      ) == "text-[20px] py-3 px-4 bg-blue-500"
    )
  }
  test("important modifer") {
    assert(
      sw(
        tw.sm(tw.hover(tw.important(tw.font_bold)))
      ) == "sm:hover:!font-bold"
    )
    assert(
      sw(
        tw.important(tw.text_red_500).hover(tw.important(tw.text_red_600))
      ) == "!text-red-500 hover:!text-red-600"
    )
  }
  test("arbitrary variant") {
    assert(
      sw(
        tw.lg(tw.variant("&:nth-child(3)", tw.hover(tw.underline)))
      ) == "lg:[&:nth-child(3)]:hover:underline"
    )
    assert(
      sw(
        tw.variant("&:nth-child(3)", tw.underline).list_disc.mx_5.text_white
      ) == "[&:nth-child(3)]:underline list-disc mx-5 text-white"
    )
  }
  test("dot values, percentage values") {
    assert(
      sw(
        tw.w_1per2.h_1dot5._left_1
      ) == "w-1/2 h-1.5 -left-1"
    )
    assert(
      sw(
        tw.md(tw.hover(tw.w_1per2.h_1dot5._left_1))
      ) == "md:hover:w-1/2 md:hover:h-1.5 md:hover:-left-1"
    )
  }
  test("color opacity") {
    assert(
      sw(
        tw.text_red_400$("10").bg_green_500$("20")
      ) == "text-red-400/10 bg-green-500/20"
    )

    assert(
      sw(
        tw.font_bold.text_red_400$("10").bg_green_500$("20").hover(tw.text_black)
      ) == "font-bold text-red-400/10 bg-green-500/20 hover:text-black"
    )

    assert(
      sw(
        tw.bg_blue_500$("25").text_white.rounded.py_3.px_4
      ) == "bg-blue-500/25 text-white rounded py-3 px-4"
    )
  }
}

class CreateNextAppHomePageTests extends munit.FunSuite {
  test("index page") {
    assert(
      sw(
        tw.flex
      ) == "flex"
    )

    assert(
      sw(
        tw.font_sans.grid
          .grid_rows_("20px_1fr_20px")
          .items_center
          .justify_items_center
          .min_h_screen
          .p_8
          .pb_20
          .gap_16
          .sm(tw.p_20)
      ) == "font-sans grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20"
    )

    assert(
      sw(
        tw.flex.flex_col.gap_8.row_start_2.items_center.sm(tw.items_start)
      ) == "flex flex-col gap-8 row-start-2 items-center sm:items-start"
    )

    assert(
      sw(
        tw.dark(tw.invert)
      ) == "dark:invert"
    )

    assert(
      sw(
        tw.font_mono.list_inside.list_decimal.text_sm.text_center.sm(tw.text_left)
      ) == "font-mono list-inside list-decimal text-sm text-center sm:text-left"
    )

    assert(
      sw(
        tw.bg_black$("[.05]").dark(tw.bg_white$("[.06]")).px_1.py_0dot5.rounded.font_semibold
      ) == "bg-black/[.05] dark:bg-white/[.06] px-1 py-0.5 rounded font-semibold"
    )

    assert(
      sw(
        tw.flex.gap_4.items_center.flex_col.sm(tw.flex_row)
      ) == "flex gap-4 items-center flex-col sm:flex-row"
    )

    assert(
      sw(
        tw.rounded_full.border.border_solid.border_transparent.transition_colors.flex.items_center.justify_center.bg_foreground.text_background.gap_2
          .hover(tw.bg_("#383838"))
          .dark(tw.hover(tw.bg_("#333")))
          .text_sm
          .sm(tw.text_base)
          .h_10
          .sm(tw.h_12)
          .px_4
          .sm(tw.px_5)
      ) == "rounded-full border border-solid border-transparent transition-colors flex items-center justify-center bg-foreground text-background gap-2 hover:bg-[#383838] dark:hover:bg-[#333] text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5"
    )

    assert(
      sw(
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
          .sm(tw.px_5.min_w_44)
      ) == "rounded-full border border-solid border-black/[.08] dark:border-white/[.145] transition-colors flex items-center justify-center hover:bg-[#f2f2f2] dark:hover:bg-[#1a1a1a] hover:border-transparent text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5 sm:min-w-44"
    )

    assert(
      sw(
        tw.row_start_3.flex.gap_6.flex_wrap.items_center.justify_center
      ) == "row-start-3 flex gap-6 flex-wrap items-center justify-center"
    )

    assert(
      sw(
        tw.flex.items_center.gap_2.hover(tw.underline.underline_offset_4)
      ) == "flex items-center gap-2 hover:underline hover:underline-offset-4"
    )
  }
}

class ClassesValidationTests extends munit.FunSuite {
  test("duplication") {
    assertNoDiff(
      compileErrors("sw(tw.flex.flex)"),
      """|error: [Duplication] flex
        |      compileErrors("sw(tw.flex.flex)"),
        |                  ^
        |""".stripMargin
    )

    assertNoDiff(
      compileErrors("sw(tw.flex.hover(tw.items_center.items_center))"),
      """|error: [Duplication] hover:items-center
        |      compileErrors("sw(tw.flex.hover(tw.items_center.items_center))"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization one-direction class to two-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.mr_2.ml_2)"),
      """|error: [Optimization] Use mx-2 instead of ml-2 and mr-2
        |      compileErrors("sw(tw.mr_2.ml_2)"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization two-directions class to four-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.mx_2.my_2)"),
      """|error: [Optimization] Use m-2 instead of mx-2 and my-2
        |      compileErrors("sw(tw.mx_2.my_2)"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization one-direction class to four-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.ml_2.mr_2.mt_2.mb_2)"),
      """|error: [Optimization] Use m-2 instead of mt-2, mb-2, ml-2 and mr-2
        |      compileErrors("sw(tw.ml_2.mr_2.mt_2.mb_2)"),
        |                  ^
        |""".stripMargin
    )
  }
}
