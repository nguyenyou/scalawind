//> using test.dep org.scalameta::munit::1.0.0

import scalawind.*

class MyTests extends munit.FunSuite {
  test("foo") {
    assert(2 + 2 == 4)
  }
}