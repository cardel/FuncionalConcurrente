/**
 * Algoritmo de Mergesort utilizando patrones con listas
 * @author Carlos Delgado
 * @date 10/10/2023
 */

object MergeSortTuplas {

  def mergeSort(lst:List[Int]):List[Int] = {
    def merge(l1:List[Int],l2:List[Int]):List[Int] = (l1,l2) match {
      case (Nil,_) => l2
      case (_,Nil) => l1
      case (x::xs,y::ys) => if (x<y) x::merge(xs,l2) else y::merge(l1,ys)
    }
    val n = lst.length/2
    if (n==0) lst
    else {
      val (l1,l2) = lst splitAt(n)
      merge(mergeSort(l1),mergeSort(l2))
    }
  }

  def main(args: Array[String]): Unit = {
    val lst = List(5, 3, 2, 1, 4)
    println(mergeSort(lst))
  }

}
