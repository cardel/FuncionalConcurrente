/**
 * Implementación del algoritmo Mergesort
 * @author Carlos Delgado
 * @date 12/10/2023
 */

object MergeSort {

  /**
   * Función que ordena una lista de enteros
   * @param list Lista de enteros
   * @return Lista ordenada
   */
  def mergesort(lst: List[Int]): List[Int] = {
    def merge(l1:List[Int], l2:List[Int]) : List[Int] = {
      (l1,l2) match {
        case (Nil,_) => l2
        case (_, Nil) => l1
        case (x::xs,y::ys) => if (x < y) x::merge(xs,l2) else y::merge(l1,ys)
        }
    } 

    val m = lst.length / 2
    if (m == 0) lst //La lista tiene tamaño i
    else {
      val (m1,m2) = lst splitAt m  //Dividimos la lista en dos sublistas
      merge(mergesort(m1), mergesort(m2)) //Ordenamos las dos sublistas y las mezclamos
    }


  }

  def main(args: Array[String]): Unit = {
    val list = List(5, 4, 3, 2, 1)
    println(mergesort(list))
  }

}
