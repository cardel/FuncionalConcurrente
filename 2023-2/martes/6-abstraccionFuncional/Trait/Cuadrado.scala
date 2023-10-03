/**
 * Clase que implementa un cuadrado
 * @author Carlos Delgado
 * @date 03/10/2023
 */

class Cuadrado (lado: Double) extends Forma with Plano {
  //Implementación de los elementos del trait
  def altura: Double = lado
  def ancho: Double = lado

  //Implementación de los elementos de la clase abstracta
  def perimetro: Double = lado * 4
  def escalar(factor: Double): Forma = new Cuadrado(lado * factor)
}
