/**
 * Implementación del conjunto vacio
 * @author Carlos Delgado
 * @date 03 de Oct de 2023
 */

object Vacio extends ConjEnt {
  def insertar(x: Int): ConjEnt = {
    new NoVacio(x, Vacio, Vacio)
  }

  def pertenece(x: Int): Boolean = {
    false
  }
  
  override def toString():String = {
    ""
  }
}
