/**
 * Clase main
 * @author Carlos Delgado
 * @date 05/10/2023
 */

object Main {
  def main(args: Array[String]): Unit = {
    val n1 =  Numero(1)
    val n2 =  Suma( Numero(2),  Numero(3))
    val n3 =  Suma( Suma(n1, n2),  Numero(4))
    println(n1, n1.eval)
    println(n2, n2.eval)
    println(n3, n3.eval)
    val n4 = Prod(Numero(2),Suma(Numero(2),Prod(Numero(3),Suma(Numero(2),Numero(3)))))
    println(n4, n4.eval)
  }

}
