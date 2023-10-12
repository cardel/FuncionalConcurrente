/**
 * Ejemplo para aplanar listas
 * @author Carlos A Delgado
 * @date 12/Oct/2023
 */

object Aplanar {
  def main(args: Array[String]) {
    val lista = List(List(1, 1), 2, List(3, List(5, 8, List(13, List(21, 34, List(55, 89, List(144, 233, List(377, 610))))))))
    println("Lista original: " + lista)
    println("Lista aplanada: " + aplanar(lista))
    val listaMascotas = List(List("Perro", "Gato"), "Pez", List("Conejo", List("Tortuga", "Cerdo"),"Caballo", "Unicornio",List(List(List(List(List("Guacamaya")))))))
    println("Lista original: " + listaMascotas)
    println("Lista aplanada: " + aplanar(listaMascotas))
  }

  def aplanar(lista: List[Any]): List[Any] = lista match {
    case Nil => Nil
    case x::xs => x match {
      case y::ys => aplanar(y::ys) ++ aplanar(xs)
      case _ => x :: aplanar(xs)
    }
  }
}
