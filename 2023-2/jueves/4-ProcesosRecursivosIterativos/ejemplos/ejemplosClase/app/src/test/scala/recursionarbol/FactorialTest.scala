package recursionarbol

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike

@RunWith(classOf[org.scalatestplus.junit.JUnitRunner])
class FactorialTest extends AnyFunSuiteLike {

  test("testFactorial") {
    val f = new Factorial()
    assert(f.factorial(6) == 720)
  }

}
