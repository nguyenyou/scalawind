//> using test.dep org.scalameta::munit::1.0.0

import scalawind.*

class ScalawindTests extends munit.FunSuite {
  test("normal") {
    assert(sw(tw.flex.items_center.justify_center) == "flex items-center justify-center")
  }
  test("modifier") {
    assert(sw(tw.md(tw.hover(tw.text_red_500))) == "md:hover:text-red-500")
  }
  test("arbitrary values") {
    assert(sw(tw.text_("#ff0")) == "text-[#ff0]")
  }
}
