import scala.annotation.tailrec
object Ejemplo2 {
  val prod = (a:Int,b:Int)=>a*b
  def main(args: Array[String]):Unit = {
    println(suma((x:Int) => x, (y:Int) => y+1, 1, 10))
    println(sumaIter((x:Int) => x, (z:Int) => z+1, 1, 10, 0))
    println(operacionIter((x:Int)=>x, (x:Int)=>x+1, (a:Int,b:Int)=>a+b, 1, 10, 0))
    println(operacionIter((x:Int)=>x, (x:Int)=>x+1, (a:Int,b:Int)=>a*b, 1, 5, 1))
  }

  def suma(f:Int=>Int, prox:Int=>Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + suma(f, prox, prox(a), b)
  }
  @tailrec
  def sumaIter(f:Int=>Int, prox:Int=>Int, a: Int, b: Int, acum: Int): Int = {
    if (a > b) acum
    else sumaIter(f, prox, prox(a), b, acum + f(a))
  }

  @tailrec
  def operacionIter(f:Int=>Int, prox:Int=>Int, op:(Int,Int)=>Int, a: Int, b: Int, acum: Int): Int = {
    if (a > b) acum
    else operacionIter(f, prox, op, prox(a), b, op(acum, f(a)))
  }

}
