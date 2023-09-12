package producto

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumaTest extends AnyFunSuiteLike {

  test("testSuma") {
    val objSuma = new Suma()
    assert(objSuma.suma(4, 6) == 10)
  }

  test("SumaIterativa") {
    val objSuma = new Suma()
    assert(objSuma.sumaIterativa(4, 6) == 10)
  }

}
