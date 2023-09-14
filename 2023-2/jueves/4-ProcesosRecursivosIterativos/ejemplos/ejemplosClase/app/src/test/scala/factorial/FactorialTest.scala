package factorial

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorialTest extends AnyFunSuiteLike {

  test("testFactorialRecursivo") {
    val objFactorial = new Factorial()
    assert(objFactorial.factorialRecursivo(5) == 120)
  }

  test ("testFactorialIterativo") {
    val objFactorial = new Factorial()
    assert(objFactorial.factorialIterativo(5) == 120)
  }

}
