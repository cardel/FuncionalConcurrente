import scala.annotation.tailrec
object Ejemplo1 {
  def indent(x:Int):Int = x
  def cuadr(x:Int):Int = x*x
  def succ(x:Int):Int = x+1
  def sum2(x:Int):Int = x+2
  def sumita(a:Int, b:Int):Int = a+b
  def prod(a:Int, b:Int):Int = a*b
  
  def main(args: Array[String]):Unit = {
    println(suma(indent, succ, 1, 10))
    println(sumaIter(indent, succ, 1, 10, 0))
    println(operacionIter(indent, succ, sumita, 1, 10, 0))
    println(operacionIter(indent, succ, prod, 1, 5, 1))
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
