/**
 * Esta clase implementa las funciones de un conjunto
 * @author Carlos Delgado
 * @date 03 de Oct de 2023
 */

abstract class ConjEnt {
  def insertar(x:Int):ConjEnt
  def pertenece(x:Int):Boolean
  //override def toString():String
}
