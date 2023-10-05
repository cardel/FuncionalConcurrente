/**
 * Clase main
 * @author Carlos Delgado
 * @date 05/10/2023
 */

object Main {
  def main(args: Array[String]): Unit = {
    val n1 = new Numero(1)
    val n2 = new Suma(new Numero(2), new Numero(3))
    val n3 = new Suma(new Suma(n1, n2), new Numero(4))
    println(n1, n1.eval)
    println(n2, n2.eval)
    println(n3, n3.eval)
  }

}
