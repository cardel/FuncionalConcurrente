/**
 * Clase para numeros primos
 * @author Carlos Delgado
 * @date 26 Oct de 2023
* @version 1.0
*/  

object Primos{
  def primos(n:Int):Boolean = {
     val valores = 2 to Math.ceil(Math.sqrt(n)).toInt
     val res = valores.filter(n % _ == 0)
      res == Nil
  }
  def primosB(n:Int):Boolean = {
    val valores = 2 to Math.ceil(Math.sqrt(n)).toInt
    val res = valores.map(n % _)
    res forall (_ != 0)
  }
  def compuesto(n:Int):Boolean ={
    val valores = 2 to Math.ceil(Math.sqrt(n)).toInt
    val res = valores.map(n % _)
    res exists (_ == 0)
  }
  def main(args: Array[String]): Unit = {
    val valores = 1 to 100
    println("Numeros primos del 1 al 100 "+valores.filter(primos(_)))
    println("Numeros primos del 1 al 100 "+valores.filter(primosB(_)))
    println("Numeros compueestos del 1 al 100"+valores.filter(compuesto(_)))
  }
  
}
