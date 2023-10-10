/**
 * Ejemplo de uso de Fold en diferentes situaciones
 * @author Carlos Delgado
 * @date 10/10/2023
 */

object EjemploFold {
  def main(arr:Array[String]):Unit = {
    // Ejemplo de uso de fold para conecatener dos listas
    val lista = List(1,2,3,4,5,6,7,8,9,10)
    val lista2 = List(10,20,30,40,50,60,70,80,90,100)
    println((lista foldRight lista2)(_::_) )
  }
}
