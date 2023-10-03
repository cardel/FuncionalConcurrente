/**
 * Implementación de la suma
 * @author Carlos Delgado
 * @date 03/10/2023
 */

class Suma(a: Expr, b:Expr) extends Expr {

  def esNumero = false
  def esSuma = true
  def opIzq : Expr = a
  def opDer : Expr = b
  def valorNum: Int = throw new Error("Esto no es un número")
}
