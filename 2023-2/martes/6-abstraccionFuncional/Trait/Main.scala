/**
 * Clase principal
 * @autor Carlos Delgado
 * @date 03/10/2023
 */

object Main {

  def main(args:Array[String]) :Unit = {
    val cuadradoA:Cuadrado = new Cuadrado(2)
    println(cuadradoA.perimetro)
    println(cuadradoA.area)
  
  }
}
