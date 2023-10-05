/**
 * Archivo main de trabajo
 * @author Carlos Delgado
 * @date 28 de Sep de 2023
 */

object Main {
  def main(args: Array[String]) : Unit = {
    val numRa1 = new Racional(1,2)
    println(numRa1)
    val numRa2 = numRa1.suma(new Racional(3,4))
    println(numRa2.num)
    //resta
    val numRa3 = numRa1.resta(new Racional(3,4))
    println(numRa3)
    //multiplicacion
    val numRa4 = numRa1.mult(new Racional(3,4))
    println(numRa4)

    //division
    val numRa5 = numRa1.div(new Racional(3,4))
    println(numRa5)

    //Comparación menor que
    println(numRa1.menorQue(new Racional(3,4)))
    println(numRa1.menorQue(new Racional(1,4)))
    //Maximo
    println(numRa1.max(new Racional(3,4)))
    println(numRa1.max(new Racional(1,4)))

    try {
      println(new Racional(3,0))
    } catch {
      case e: IllegalArgumentException => e.printStackTrace()
    }
    //SUma
    val numRa20:Racional = new Racional(7,6)
    println(numRa20.suma(new Racional(1,5)))
    println(numRa20 suma new Racional(1,5))
  }
}

