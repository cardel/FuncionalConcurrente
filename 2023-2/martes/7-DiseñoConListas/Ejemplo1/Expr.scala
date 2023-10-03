/*
 * Clase expresión
 * @author Carlos Delgado
 * @date 03/Oct/2023
 */

trait Expr {
  def esNumero: Boolean
  def esSuma: Boolean
  def valorNum: Int
  def opIzq: Expr
  def opDer: Expr

  def eval():Int = {
    if (this.esNumero) this.valorNum
    else if (this.esSuma) this.opIzq.eval() + this.opDer.eval()
    else throw new Error("Esto no es una expresión")
  }
}
