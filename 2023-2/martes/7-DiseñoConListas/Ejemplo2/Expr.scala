/**
 * Clase expr pero usando cases
 * @author Carlos Delgado
 * @date 03-Oct-2023
 */

trait Expr {

def eval():Int = 
  this match {
    case Numero(n) => n
    case Suma(e1,e2) => e1.eval() + e2.eval()
    case Prod(e1,e2) => e1.eval() * e2.eval()
}

}
case class Numero(n: Int) extends Expr
case class Suma(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr 

object Numero {
  def apply(n:Int) = new Numero(n)
}

object Suma {
  def apply(e1:Expr, e2:Expr) = new Suma(e1, e2)
}

object Prod {
  def apply(e1:Expr, e2:Expr) = new Prod(e1, e2)
}

