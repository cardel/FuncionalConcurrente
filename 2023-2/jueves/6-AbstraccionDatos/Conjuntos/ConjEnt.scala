/**
 * Clase abstracta de conjunto de enteros
 * @author Carlos Delgado
 * @date 05 de Oct 2023
 */

abstract class ConjEnt {
  def insertar(x: Int): ConjEnt
  def pertenece(x: Int): Boolean
}
