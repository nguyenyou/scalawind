package tests.prefix.only

import scalawind.*

class SimplePrefixSingleTests extends munit.FunSuite {
  test("normal") {
    assert(
      sw(
        tw.flex
      ) == "sw-flex"
    )

    assert(
      sw(
        tw.flex.items_center
      ) == "sw-flex sw-items-center"
    )
  }
  test("modifier") {
    assert(
      sw(
        tw.hover(tw.text_red_500)
      ) == "hover:sw-text-red-500"
    )
  }
}
