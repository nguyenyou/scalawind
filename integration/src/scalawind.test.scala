//> using test.dep org.scalameta::munit::1.0.0

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
  test("arbitrary values") {
    assert(
      sw(
        tw.text_("#ff0")
      ) == "text-[#ff0]"
    )
  }
  test("opacity color") {
    assert(
      sw(
        tw.bg_red_400.opacity(10)
      ) == "bg-red-400/10"
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
        tw.w_1$2
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
        tw.w_1$2.h_1dot5._left_1
      ) == "w-1/2 h-1.5 -left-1"
    )
    assert(
      sw(
        tw.md(tw.hover(tw.w_1$2.h_1dot5._left_1))
      ) == "md:hover:w-1/2 md:hover:h-1.5 md:hover:-left-1"
    )
  }
}
