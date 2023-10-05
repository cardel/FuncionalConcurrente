/**
 * Numero como expresion
 * @author Carlos Delgado
 * @date 05 de Oct 2023
 */

class Numero(val valor: Int) extends Expr {
  def esNumero = true
  def esSuma = false
  def valorNum = valor
  def opIzq = throw new Error("Numero.leftOp")
  def opDer = throw new Error("Numero.rightOp")
  override def toString = valor.toString
}
