/**
 * Suma como una expresion
 */

class Suma(e1:Expr, e2:Expr) extends Expr {
  def esNumero = false
  def esSuma = true
  def valorNum = throw new Error("Suma.valorNum")
  def opIzq = e1
  def opDer = e2
  override def toString = "(" + e1.toString + " + " + e2.toString + ")"
}
