/**
 * Ejemplo de uso de vectores
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object EjemploVector {
  def main(arr:Array[String]):Unit = {
    // Declaración de un vector
    val vector = Vector(1,2,3,4,5)

    // Imprimir el vector
    println(vector)
    println(1 +: vector) // Agregar un elemento al inicio
    println(vector :+ 6) // Agregar un elemento al final
  }

}
