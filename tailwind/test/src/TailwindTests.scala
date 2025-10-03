package tailwind

import utest.*
import io.github.nguyenyou.tailwind.{*, given}

object TailwindTests extends TestSuite {
  val tests = Tests {
    test("normal") {
      val styles: String = tw.flex.bg_black

      assert(styles == "flex bg-black")
    }
  }
}
