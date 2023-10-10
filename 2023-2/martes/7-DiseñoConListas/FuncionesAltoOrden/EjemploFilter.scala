/**
 * Ejemplo del filter
 * @author: Carlos A Delgado
 * @date: 10/Oct/2023
 */

object EjemploFilter {
  def main(args: Array[String]) {
    val lista = List(1,2,3,4,5,6,7,8,9,10)
    val lista2 = lista.filter(x => x % 2 == 0)
    println(lista2)
    println(lista.filter(x => x % 2 == 0 && x > 5))
  }
}
