import scala.annotation.tailrec
object Currilificacion1 {
  def main(args: Array[String]): Unit = {
    println(sumaCurri(x=>x) _)
    println(sumaCurri(x=>x) (x=>x+1) _)
    println(sumaCurri(x=>x) (x=>x+1) (1,10))
    println(opCurri(x=>x) (x=>x+1) (1,10,0))
    println(opGenCurri(x=>x) (x=>x+1) (1,5,1))
    println(opGenCurri2(x=>x) (x=>x+1) ((a,b)=>a*b) (1,5,1))
  }

  def sumaCurri(f:Int=>Int)(prox:Int=>Int)(a:Int,b:Int): Int = {
    if(a>b) 0
    else f(a) + sumaCurri(f)(prox)(prox(a),b)
  }

  @tailrec
  def opCurri(f:Int=>Int)(prox:Int=>Int)(a:Int,b:Int,acc:Int): Int = {
    if(a>b) acc
    else opCurri(f)(prox)(prox(a),b,acc+f(a))
  }

  @tailrec
  def opGenCurri(f:Int=>Int)(prox:Int=>Int)(a:Int,b:Int,acc:Int): Int = {
    if(a>b) acc
    else opGenCurri(f)(prox)(prox(a),b,acc*f(a))
  }

  /**
 * Currificar la función opGenCurri introduciendo un op que toma acc y f(a)
 * y devuelve un nuevo acc
 */
  def opGenCurri2(f:Int=>Int)(prox:Int=>Int)(op:(Int,Int)=>Int)(a:Int,b:Int,acc:Int): Int = {
    if(a>b) acc
    else opGenCurri2(f)(prox)(op)(prox(a),b,op(acc,f(a)))
  }

  


}
