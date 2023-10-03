/**
 * Clase main de prueba
 * @author Carlos Delgado
 * @date 03 de Oct de 2023
 */

object Main {

  def main(args: Array[String]): Unit = {
    val a = new Numero(5)
    val b = new Numero(3)
    println(new Suma(a,b).eval())
    println(new Prod(new Suma(a,b),new Prod(a,b)).eval())
  }
}
