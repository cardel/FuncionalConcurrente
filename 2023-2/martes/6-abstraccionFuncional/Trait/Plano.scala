/**
 * Trait de un plano en 2D
 * @author Carlos Delgado
 * @date 03 de Oct de 2023
 */

trait Plano {
  def altura:Double
  def ancho:Double
  def area:Double = altura * ancho
}
