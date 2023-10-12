/**
 * Ejemplificación de ordenamiento en listas usando patrones
 * Insertion sort y Merge sort
 * @author Carlos Delgado
 * @date 12/10/2023
 */

object SortListas {
  def insertion_sort(lst:List[Int]): List[Int] = {
    def insert(x:Int, lst:List[Int]):List[Int] = lst match {
      case Nil => List(x)
      case h :: t => if (x < h) x :: lst else h :: insert(x, t)
    }
    lst match {
      case Nil => Nil
      case h :: t => insert(h, insertion_sort(t))
    }
  }

  def main(arr:Array[String]) {
    println(insertion_sort(List(3,4,5,10,23,1,0,-2,-4,5)))
  }
}
