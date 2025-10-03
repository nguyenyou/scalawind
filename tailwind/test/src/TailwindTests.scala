package tailwind

import utest.*
import io.github.nguyenyou.tailwind.*

object TailwindTests extends TestSuite {
  val tests = Tests {
    test("normal") {
      assert(tw.flex.bg_black.toString == "flex bg-black")
    }
  }
}
