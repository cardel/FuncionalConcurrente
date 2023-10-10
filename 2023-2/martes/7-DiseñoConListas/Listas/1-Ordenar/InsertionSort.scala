/**
 * Algoritmo de insertion sort para ordenar listas
 * @author Carlos Delgado
 * @date 10/Oct/2023
 */

class InsertionSort {

  def iSort(xs: List[Int]): List[Int] = {
    def insert(x:Int, xs: List[Int]): List[Int] = 
      xs match {
        case List() => List(x)
        case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
      }

    xs match{
      case List() => List()
      case y :: ys => insert(y, iSort(ys))
  }
}

}
