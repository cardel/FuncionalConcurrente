/**
 * Ejemplo de aplanar una Lista
 * @author Carlos Delgado
 * @date 10/10/2023
 */

object Aplanar {

  def aplanar(lista: List[Any]): List[Any] = lista match {
    case Nil => Nil //Caso que la lista sea vacía
    case x :: xs => x match { //Caso que la lista tenga elementos
      case Nil => aplanar(xs) //Caso que el elemento sea una lista vacía
      case y :: ys => y :: aplanar(ys) ++ aplanar(xs) //Caso que el elemento sea una lista con elementos
      case _ => x :: aplanar(xs) //Caso que el elemento sea un valor
    }
  }

  def main(args: Array[String]): Unit = {
    val lista = List(List(1, 1), 2, List(3, List(5, 8)))
    println(aplanar(lista))
  }

}
