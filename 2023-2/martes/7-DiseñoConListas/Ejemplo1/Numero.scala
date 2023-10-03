/**
 * Clase suma
 * @author Carlos Delgado
 * @date 03/10/2023
 */

class Numero(n:Int) extends Expr {
  def esNumero = true
  def esSuma = false
  def opIzq : Expr = throw new Error("Numero.opIzq")
  def opDer : Expr = throw new Error("Numero.opDer")
  def valorNum: Int = n
}
