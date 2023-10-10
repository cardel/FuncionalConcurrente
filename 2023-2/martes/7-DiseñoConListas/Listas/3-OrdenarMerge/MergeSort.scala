/**
 * Algoritmo de Mergesort utilizando patrones con listas
 * @author Carlos Delgado
 * @date 10/10/2023
 */

object MergeSort {

  def mergeSort(lst:List[Int]):List[Int] = {
    def merge(l1:List[Int], l2:List[Int]): List[Int] = {
      l1 match {
        case Nil => l2
        case x::xs => l2 match {
          case Nil => l1
          case y::ys => if (x < y) x::merge(xs, l2) else y::merge(l1, ys)
        }

      }
    }
    val m:Int = lst.length / 2
    if (m == 0) lst
    else {
      val (l1, l2) = lst splitAt m
      merge(mergeSort(l1), mergeSort(l2))
    }

  }

  def main(args: Array[String]): Unit = {
    val lst = List(5, 3, 2, 1, 4)
    println(mergeSort(lst))
  }

}
