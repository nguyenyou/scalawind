package tailwind

import utest.*
import io.github.nguyenyou.tailwind.{*, given}

object TailwindTests extends TestSuite {
  val tests = Tests {
    test("normal") {
      val classes: String = tw.flex.bg_black
      assert(classes == "flex bg-black")
    }
  }
}
