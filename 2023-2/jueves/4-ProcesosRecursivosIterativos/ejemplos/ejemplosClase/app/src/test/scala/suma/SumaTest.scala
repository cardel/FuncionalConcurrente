package suma

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumaTest extends AnyFunSuiteLike {

  test("testSumaRecursiva") {
    val objSuma = new Suma()
    assert(objSuma.sumaRecursiva(5, 3) == 8)
  }

  test ("testSumaIterativa") {
    val objSuma = new Suma()
    assert(objSuma.sumaIterativa(5, 3) == 8)
  }

}
