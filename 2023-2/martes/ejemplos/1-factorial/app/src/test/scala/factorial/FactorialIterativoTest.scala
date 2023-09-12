package factorial

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorialIterativoTest extends AnyFunSuiteLike {

  test("testFactaux") {
    val objFactorialIterativo = new FactorialIterativo()
    assert(objFactorialIterativo.factaux(1, 5, 1) == 120)
  }

}
