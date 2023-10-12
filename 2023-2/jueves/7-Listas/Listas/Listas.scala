/**
 * Ejemplo de listas de la clase
 * @author Carlos Delgado
 * @date 12/10/2023
 */

object Listas {
  def main(str:Array[String]) {
    println(2 :: 3 :: Nil)
    println(2 :: 3 :: 4 :: List(1,2,3))
    println((2::3::4::Nil)::List(1,2,3)::(5::6::Nil)::Nil)
    println(List(1,2,3,4,5,6,7,8,9,10).tail.tail.tail.tail.tail.tail.head)

    val listaSalvaje = List(1,2,3,4,5,6,7,8,9,10)
    
    listaSalvaje match {
      case x :: y :: z :: _ => println(x, y, z)
      case _ => println("No hay suficientes elementos")
    }

  }
}
