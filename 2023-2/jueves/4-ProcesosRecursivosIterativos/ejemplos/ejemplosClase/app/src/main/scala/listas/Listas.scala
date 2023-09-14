package listas

import scala.annotation.tailrec

class Listas {

  /**
   * Función que suma los elementos de una lista usando recursión lineal
   * @param lst
   * @return
   */
  def suma(lst: List[Int]) : Int = {
    if (lst.isEmpty) 0
    else lst.head + suma(lst.tail)
  }

  /**
   * Función que suma los elementos de una lista usando recursión de cola
   * @param lst List[Int] lista de enteros
   * @return Int suma de los elementos de la lista
   */
  def sumaTC(lst: List[Int]) : Int = {
    @tailrec
    def sumaTC(lst: List[Int], acum: Int): Int = {
      if (lst.isEmpty) acum
      else sumaTC(lst.tail, acum + lst.head)
    }

    sumaTC(lst, 0)
  }
}
