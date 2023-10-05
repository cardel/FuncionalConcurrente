/**
 * Metodo main
 * @author Carlos Delgado
 * @date 05 de Oct de 2023
 */

object Main {
  def main(args: Array[String]): Unit = {
    val arb1 = new Arbol(4, null, null)
    println(arb1)

    val arb2 = arb1.insertar(5)
    println(arb2)

    val arb3 = arb2.insertar(3)
    println(arb3)

    val arb4 = arb3.insertar(5)
    println(arb4)
  }

}
