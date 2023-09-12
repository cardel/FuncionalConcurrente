package listas

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListasTest extends AnyFunSuiteLike {

  test("testSegundoElemento") {
    val objListas = new Listas()
    assert(objListas.segundoElemento(List(1, 2, 3)) == 2)
  }

  test("PrimerElemento") {
    val objListas = new Listas()
    assert(objListas.primerElemento(List(1, 2, 3)) == 1)
  }

  test("TercerElemento") {
    val objListas = new Listas()
    assert(objListas.tercerElemento(List(1, 2, 3)) == 3)
  }

  test("SumarElementos") {
    val objListas = new Listas()
    assert(objListas.sumarElementos(List(1,2,3,4,5,6,7,8,9,10,11) ) == 66)
  }

  test("SumarElementosIterativo") {
    val objListas = new Listas()
    assert(objListas.sumarElementosRecursividadDeCola(List(1,2,3,4,5,6,7,8,9,10,11) ) == 66)
  }

  test ("Insertar elemento al inicio") {
    val objListas = new Listas()
    assert(objListas.insertarElementoInicio(List(1,2,3,4,5,6,7,8,9,10,11), 0) == List(0,1,2,3,4,5,6,7,8,9,10,11))
  }

  test ("Insertar elemento al final") {
    val objListas = new Listas()
    assert(objListas.insertarElementoFinal(List(1,2,3,4,5,6,7,8,9,10,11), 12) == List(1,2,3,4,5,6,7,8,9,10,11,12))
  }
}
