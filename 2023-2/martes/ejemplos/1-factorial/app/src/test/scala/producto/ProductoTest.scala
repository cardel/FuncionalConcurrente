package producto

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ProductoTest extends AnyFunSuiteLike {

  test("testFactorial") {
    val objProducto = new Producto()
    assert(objProducto.factorial(5) == 120)
  }

}
