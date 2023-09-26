/**
 * Clase main del ejemplo de Racional
 * @author Carlos Delgado
 * @date 26 de Septiembre 2023
 */

object Main{

  def main(str:Array[String]):Unit = {
    val objRacional = new Racional(4,3)
    println(objRacional)
    println(objRacional.numer+"/"+objRacional.deno)
    val objResultado = objRacional.suma(new Racional(1,2))
    println(objResultado.toString)
    println(objResultado)
    println(objRacional.suma(new Racional(-1,3)).multiplicacion(new Racional(2,2)))
    println(objRacional.representacion())
    println(objRacional.menorQue(new Racional(1,2)))
    println(objRacional.menorQue(new Racional(5,2)))
    println(objRacional.max(new Racional(1,2)))
    println(objRacional.max(new Racional(5,2)))
    try {
      println(new Racional(1,0))
    } catch {
      case e:IllegalArgumentException => println("Excepcion capturada: "+e)
    }
    println(new Racional(1,2).suma(new Racional(1,2)).suma(new Racional(1,2)))
  }
}
