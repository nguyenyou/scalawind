//> using test.dep org.scalameta::munit::1.0.0

import scalawind.*

class SimpleSingleTests extends munit.FunSuite {
  test("normal") {
    assert(sw(tw.flex.items_center.justify_center) == "flex items-center justify-center")
  }
  test("modifier") {
    assert(sw(tw.hover(tw.text_red_500)) == "hover:text-red-500")
  }
  test("arbitrary values") {
    assert(sw(tw.text_("#ff0")) == "text-[#ff0]")
  }
  test("opacity color") {
    assert(sw(tw.bg_red_400.opacity(10)) == "bg-red-400/10")
  }
  test("dot values") {
    assert(sw(tw.w_1dot5) == "w-1.5")
  }
  test("percentage values") {
    assert(sw(tw.w_1$2) == "w-1/2")
  }
  test("negative values") {
    assert(sw(tw._left_1) == "-left-1")
  }
  test("raw values") {
    assert(sw(tw.raw("text-green-400")) == "text-green-400")
  }
}

class ComplexChainingTests extends munit.FunSuite {
  test("responsive") {
    assert(sw(tw.md(tw.hover(tw.text_red_500))) == "md:hover:text-red-500")
  }
}
