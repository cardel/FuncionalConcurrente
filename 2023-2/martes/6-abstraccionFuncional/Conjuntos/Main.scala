/**
 * Método para probar los conjuntos
 * @author Carlos Delgado
 * @date 03 de Octubre de 2023
 */

object Main {
  def main(args:Array[String]):Unit = {
    val vacio:ConjEnt = Vacio
    println(vacio.pertenece(1))
    val conjuntoA = vacio.insertar(1)
    println(conjuntoA.pertenece(1))
    println(conjuntoA)
    println(vacio.insertar(2).insertar(1).insertar(3).insertar(10).insertar(5).insertar(1).insertar(2).insertar(3).insertar(10).insertar(5))
  }

}
