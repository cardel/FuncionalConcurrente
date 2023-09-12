package factorial

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorialLinealTest extends AnyFunSuiteLike {

  test("testFactorial") {
    val objFactorialLineal = new FactorialLineal()
    assert(objFactorialLineal.factorial(5) == 120)
  }

}
