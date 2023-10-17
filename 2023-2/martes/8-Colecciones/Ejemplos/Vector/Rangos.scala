/**
 * Ejemplo de rangos en Scala
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object Rangos {

  def main(arr:Array[String]):Unit = {
    val rangoA = 1 to 10
    println(rangoA)
    for (i <- rangoA) {
      print(i+" ")
    }
    println()
    val rangoB = 1 until 10
    println(rangoB)
    for (i <- rangoB) {
      print(i+" ")
    }
    println()
    val rangoC = 1 to 10 by 2
    println(rangoC)
    for (i <- rangoC) {
      print(i+" ")
    }
    println()
    val rangoD = 10 to 1 by -1
    println(rangoD)
    for (i <- rangoD) {
      print(i+" ")
    }
    println()
    val rangoE = 10 to 1 //Este rango es vacío porque no se especifica el incremento, y este es por defecto 1
    println(rangoE)
    for (i <- rangoE) {
      print(i+" ")
    }
    println()
  }
}
