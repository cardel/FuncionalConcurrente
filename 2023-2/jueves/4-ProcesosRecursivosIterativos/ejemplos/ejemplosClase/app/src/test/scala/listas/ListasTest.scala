package listas

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListasTest extends AnyFunSuiteLike {

  test("testSuma") {
    val objListas = new Listas()
    assert(objListas.suma(List(1, 2, 3, 4, 5)) == 15)
  }

  test ("testSumaTC") {
    val objListas = new Listas()
    assert(objListas.sumaTC(List(1, 2, 3, 4, 5)) == 15)
  }

}
