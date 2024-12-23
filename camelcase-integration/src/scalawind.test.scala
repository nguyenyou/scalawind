//> using test.dep org.scalameta::munit::1.0.3
package tests.only

import scalawind.*

class SimpleSingleTests extends munit.FunSuite {
  test("normal") {
    assert(
      sw(
        tw.flex.itemsCenter.justifyCenter
      ) == "flex items-center justify-center"
    )
    assert(
      sw(
        tw.bgBlue500.textWhite.rounded.py3.px4
      ) == "bg-blue-500 text-white rounded py-3 px-4"
    )
  }
  test("modifier") {
    assert(
      sw(
        tw.hover(tw.textRed500)
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
  test("dot values") {
    assert(
      sw(
        tw.`w_1.5`
      ) == "w-1.5"
    )
  }
  test("percentage values") {
    assert(
      sw(
        tw.`w_1/2`
      ) == "w-1/2"
    )
  }
  test("negative values") {
    assert(
      sw(
        tw._left1
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
        tw.important(tw.textRed400)
      ) == "!text-red-400"
    )
  }
  test("color opacity") {
    assert(
      sw(
        tw.textRed400$("10")
      ) == "text-red-400/10"
    )
    assert(
      sw(
        tw.bgBlack$("[.05]")
      ) == "bg-black/[.05]"
    )
  }

  test("responsive design") {
    assert(
      sw(
        tw._2xl(tw.textBlack)
      ) == "2xl:text-black"
    )

    assert(
      sw(
        tw.md(tw.textBlack)
      ) == "md:text-black"
    )
  }
}

class ComplexChainingTests extends munit.FunSuite {
  test("stacked modifiers") {
    assert(sw(tw.md(tw.hover(tw.textRed500))) == "md:hover:text-red-500")
    assert(
      sw(
        tw.bgBlue500
          .hover(tw.bgBlue600)
          .firstLetter(tw.textRed500.fontBold)
          .textWhite
          .rounded
          .py3
          .px4
          .md(tw.py4.px5)
          .dark(tw.bgSky900.hover(tw.bgSky800))
      ) == "bg-blue-500 hover:bg-blue-600 first-letter:text-red-500 first-letter:font-bold text-white rounded py-3 px-4 md:py-4 md:px-5 dark:bg-sky-900 dark:hover:bg-sky-800"
    )
  }
  test("arbitrary values") {
    assert(
      sw(
        tw.flex.text_("#ff0").itemsCenter.bg_("#00f")
      ) == "flex text-[#ff0] items-center bg-[#00f]"
    )
    assert(
      sw(
        tw.text_("20px").py3.px4.bgBlue500
      ) == "text-[20px] py-3 px-4 bg-blue-500"
    )
  }
  test("important modifer") {
    assert(
      sw(
        tw.sm(tw.hover(tw.important(tw.fontBold)))
      ) == "sm:hover:!font-bold"
    )
    assert(
      sw(
        tw.important(tw.textRed500).hover(tw.important(tw.textRed600))
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
        tw.variant("&:nth-child(3)", tw.underline).listDisc.mx5.textWhite
      ) == "[&:nth-child(3)]:underline list-disc mx-5 text-white"
    )
    assert(
      sw(
        tw.variant("&:nth-child(3)", tw.underline.flex).listDisc.mx5.textWhite
      ) == "[&:nth-child(3)]:underline [&:nth-child(3)]:flex list-disc mx-5 text-white"
    )
  }
  test("dot values, percentage values") {
    assert(
      sw(
        tw.`w_1/2`.`h_1.5`._left1
      ) == "w-1/2 h-1.5 -left-1"
    )
    assert(
      sw(
        tw.md(tw.hover(tw.`w_1/2`.`h_1.5`._left1))
      ) == "md:hover:w-1/2 md:hover:h-1.5 md:hover:-left-1"
    )
  }
  test("color opacity") {
    assert(
      sw(
        tw.textRed400$("10").bgGreen500$("20")
      ) == "text-red-400/10 bg-green-500/20"
    )

    assert(
      sw(
        tw.fontBold.textRed400$("10").bgGreen500$("20").hover(tw.textBlack)
      ) == "font-bold text-red-400/10 bg-green-500/20 hover:text-black"
    )

    assert(
      sw(
        tw.bgBlue500$("25").textWhite.rounded.py3.px4
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
        tw.fontSans.grid
          .gridRows_("20px_1fr_20px")
          .itemsCenter
          .justifyItemsCenter
          .minHScreen
          .p8
          .pb20
          .gap16
          .sm(tw.p20)
      ) == "font-sans grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20"
    )

    assert(
      sw(
        tw.flex.flexCol.gap8.rowStart2.itemsCenter.sm(tw.itemsStart)
      ) == "flex flex-col gap-8 row-start-2 items-center sm:items-start"
    )

    assert(
      sw(
        tw.dark(tw.invert)
      ) == "dark:invert"
    )

    assert(
      sw(
        tw.fontMono.listInside.listDecimal.textSm.textCenter.sm(tw.textLeft)
      ) == "font-mono list-inside list-decimal text-sm text-center sm:text-left"
    )

    assert(
      sw(
        tw.bgBlack$("[.05]").dark(tw.bgWhite$("[.06]")).px1.`py_0.5`.rounded.fontSemibold
      ) == "bg-black/[.05] dark:bg-white/[.06] px-1 py-0.5 rounded font-semibold"
    )

    assert(
      sw(
        tw.flex.gap4.itemsCenter.flexCol.sm(tw.flexRow)
      ) == "flex gap-4 items-center flex-col sm:flex-row"
    )

    assert(
      sw(
        tw.roundedFull.border.borderSolid.borderTransparent.transitionColors.flex.itemsCenter.justifyCenter.bgForeground.textBackground.gap2
          .hover(tw.bg_("#383838"))
          .dark(tw.hover(tw.bg_("#333")))
          .textSm
          .sm(tw.textBase)
          .h10
          .sm(tw.h12)
          .px4
          .sm(tw.px5)
      ) == "rounded-full border border-solid border-transparent transition-colors flex items-center justify-center bg-foreground text-background gap-2 hover:bg-[#383838] dark:hover:bg-[#333] text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5"
    )

    assert(
      sw(
        tw.roundedFull.border.borderSolid
          .borderBlack$("[.08]")
          .dark(tw.borderWhite$("[.145]"))
          .transitionColors
          .flex
          .itemsCenter
          .justifyCenter
          .hover(tw.bg_("#f2f2f2"))
          .dark(tw.hover(tw.bg_("#1a1a1a")))
          .hover(tw.borderTransparent)
          .textSm
          .sm(tw.textBase)
          .h10
          .sm(tw.h12)
          .px4
          .sm(tw.px5.minW44)
      ) == "rounded-full border border-solid border-black/[.08] dark:border-white/[.145] transition-colors flex items-center justify-center hover:bg-[#f2f2f2] dark:hover:bg-[#1a1a1a] hover:border-transparent text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5 sm:min-w-44"
    )

    assert(
      sw(
        tw.rowStart3.flex.gap6.flexWrap.itemsCenter.justifyCenter
      ) == "row-start-3 flex gap-6 flex-wrap items-center justify-center"
    )

    assert(
      sw(
        tw.flex.itemsCenter.gap2.hover(tw.underline.underlineOffset4)
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
      compileErrors("sw(tw.flex.hover(tw.itemsCenter.itemsCenter))"),
      """|error: [Duplication] hover:items-center
        |      compileErrors("sw(tw.flex.hover(tw.itemsCenter.itemsCenter))"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization one-direction class to two-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.mr2.ml2)"),
      """|error: [Optimization] Use mx-2 instead of ml-2 and mr-2
        |      compileErrors("sw(tw.mr2.ml2)"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization two-directions class to four-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.mx2.my2)"),
      """|error: [Optimization] Use m-2 instead of mx-2 and my-2
        |      compileErrors("sw(tw.mx2.my2)"),
        |                  ^
        |""".stripMargin
    )
  }

  test("optimization one-direction class to four-directions class") {
    assertNoDiff(
      compileErrors("sw(tw.ml2.mr2.mt2.mb2)"),
      """|error: [Optimization] Use m-2 instead of mt-2, mb-2, ml-2 and mr-2
        |      compileErrors("sw(tw.ml2.mr2.mt2.mb2)"),
        |                  ^
        |""".stripMargin
    )
  }
}

class ImplicitConversionTests extends munit.FunSuite {
  test("string implicit conversion") {
    val css: String = tw.flex.itemsCenter.justifyCenter
    assert(
      css == "flex items-center justify-center"
    )
  }

  test("css method") {
    assert(
      tw.flex.itemsCenter.justifyCenter.css == "flex items-center justify-center"
    )
  }
}
