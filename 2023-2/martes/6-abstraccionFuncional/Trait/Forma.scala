/**
 * Clase forma
 * @author Carlos Delgado
 * @date 03/10/2023
 */

abstract class Forma {
  def perimetro: Double
  def escalar(factor: Double): Forma
}
