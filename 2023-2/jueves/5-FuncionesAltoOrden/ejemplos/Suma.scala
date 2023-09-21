/**
 * Ejemplo de currificación de la suma
 */

object Suma {

  def suma(a: Int)(b: Int) = a + b
  def suma3(a: Int)(b: Int)(c: Int) = a + b + c
  def suma2(a: Int)(b: Int = 10) = a + b

  def main(args: Array[String]): Unit = {
    println(suma(5)_)
    println(suma(5)(10))
    println(suma3(10)_)
    println(suma3(10)(20)_)
    println(suma3(10)(20)(30))
    println(suma2(10)())
    println(suma2(10)(20))
  }
}
