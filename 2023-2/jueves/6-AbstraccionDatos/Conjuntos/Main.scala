/**
 * Archivo main
 * @author Carlos Delgado
 * @date 05 Oct 2023
 */

object Main {
  def main(arr:Array[String]):Unit = {
    val conjunto = ConjVacio
    println(conjunto.toString)

    val conjunto2 = conjunto.insertar(1)
    println(conjunto2.toString)

    val conjunto3 = conjunto2.insertar(2)
    println(conjunto3.toString)

    val conjunto4 = conjunto3.insertar(2)
    println(conjunto4.toString)
  }

}
