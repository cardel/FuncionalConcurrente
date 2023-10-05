/**
 * Este trait representa una expresión en Scala
 * @author Carlos Delgado
 * @date 05 de Oct de 2023
 */

trait Expr {
  def esNumero: Boolean
  def esSuma: Boolean
  def valorNum:Int
  def opIzq: Expr
  def opDer: Expr
  def eval: Int = {
    if (esNumero) valorNum
    else if (esSuma) opIzq.eval + opDer.eval
    else throw new Error("Unknown expression")
  }
}
