/**
 * Algoritmo de Mergesort utilizando patrones con listas
 * @author Carlos Delgado
 * @date 10/10/2023
 */

object MergeSortTuplasCurrificado {

  def mergeSort[T](lst:List[T])(pred:(T,T)=>Boolean):List[T] = {
    def merge(l1:List[T])(l2:List[T]):List[T] = (l1,l2) match {
      case (Nil,_) => l2
      case (_,Nil) => l1
      case (x::xs,y::ys) => if (pred(x,y)) x::merge(xs)(l2)
                            else y::merge(l1)(ys)
      case _ => Nil
    }

    val n = lst.length/2
    if (n==0) lst
    else {
      val (l1,l2) = lst splitAt(n)
      merge(mergeSort(l1)(pred))(mergeSort(l2)(pred))
    }
  }

  def main(args: Array[String]): Unit = {
    val lst:List[Int] = List(5, 3, 2, 1, 4)
    println(mergeSort(lst)((x:Int,y:Int)=>x<y))
    println(mergeSort(lst)((x:Int,y:Int)=>x>y))
    val lstB:List[String] = List("hola", "adios", "buenas", "tardes")
    println(mergeSort(lstB)((x:String,y:String)=>x<y))
    val lstMascota:List[Mascota] = List(new Mascota("firulais", 5), new Mascota("Pelusa", 3), new Mascota("Mimi", 2), new Mascota("Luna", 1), new Mascota("Scooby", 4))
    println(mergeSort(lstMascota)((x:Mascota,y:Mascota)=>x.edad<y.edad))
    println(mergeSort(lstMascota)((x:Mascota,y:Mascota)=>x.edad>y.edad))
    println(mergeSort(lstMascota)((x:Mascota,y:Mascota)=>x.nombre<y.nombre))
    println(mergeSort(lstMascota)((x:Mascota,y:Mascota)=>x.nombre>y.nombre))
  }

  class Mascota(val nombre:String, val edad:Int) {
    override def toString = nombre + " " + edad
    
  }

}
