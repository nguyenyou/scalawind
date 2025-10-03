package scalawind

import utest.*
import io.github.nguyenyou.scalawind.*

object ScalawindTests extends TestSuite {
  val tests = Tests {
    test("simple") {
      test("normal") {
        assert(tw.flex.items_center.justify_center.css == "flex items-center justify-center")
      }
    }
  }
}
