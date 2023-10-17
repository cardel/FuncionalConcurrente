/**
 * Ejemplo de Arrays
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object EjemploArrays {
  def main(arr:Array[String]):Unit = {
    // Declaración de un array
    val array = Array(1,2,3,4,5)

    // Imprimir el array
    println(array)
    println(1 +: array) // Agregar un elemento al inicio
    println(array :+ 6) // Agregar un elemento al final

    // Imprimir el array con un ciclo for
    for (i <- array) {
      print(i+" ")
    }
    println()
    println("Hola mundo".filter(_ < 'h'))
    println("Hola mundo" forall ((x) => x < 'h'))
    println("Hola mundo" forall ((x) => x < 'z'))
    val arregloA = Array(1,2,3,4,5)
    val arregloB = Array(6,7,8,9,10)

    println(arregloA zip arregloB)
    for (i <- arregloA zip arregloB) {
      print(i+" ")
    }
    println()

  }

}
