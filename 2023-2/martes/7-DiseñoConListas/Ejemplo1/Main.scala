/**
 * Archivo Main
 * @author Carlos Delgado
 * @date 03/10/2023
 */

object Main {

  def main(args:Array[String]):Unit = {
    val a = new Numero(1)
    val b = new Numero(2)
    val e = new Suma(a,b)
    println(e.eval())
    println(new Suma(new Suma(a,b),new Suma(new Suma(a,b),new Suma(a,b))).eval())
  }
}
