/**
 * Ejemplo de la suma de cuadrados
 */

object Ejemplo3 {
  def suma(a:Int, b:Int):Int = {
    if (a>b) 0
    else a+suma(a+1,b)
  }

  def sumaCurri(a:Int)(b:Int):Int = {
    if (a>b) 0
    else a+sumaCurri(a+1)(b)
  }

  def sumaCurriV2(f:Int=>Int)(a:Int)(b:Int):Int = {
    if (a>b) 0
    else a+sumaCurriV2(f)(f(a))(b)
  }
  def sumaCurriV3(f:Int=>Int)(g:Int=>Int)(a:Int)(b:Int):Int = {
    if (a>b) 0
    else g(a)+sumaCurriV3(f)(g)(f(a))(b)
  }

  def sumaCurriV4(f:Int=>Int)(g:Int=>Int)(op:(Int,Int)=>Int)(a:Int)(b:Int):Int = {
    if (a>b) 0
    else op(g(a),sumaCurriV4(f)(g)(op)(f(a))(b))
  }

  def main(args: Array[String]) : Unit = {
    println("La suma entre 1 y 5 " + suma(1,5))
    println("La suma entre 1 y 5 " + sumaCurri(1)(5))
    println("La suma entre 1 y 5 " + sumaCurriV2(x=>x+1)(1)(5))
    println("La suma entre 1 y 5 " + sumaCurriV3(x=>x+1)(x=>x)(1)(5))
    println("La suma de los cuadrados entre 1 y 5 es " + sumaCurriV3(x=>x+1)(x=>x*x)(1)(5))
    println("La suma entre 1 y 5 " + sumaCurriV4(x=>x+1)(x=>x)((a,b)=>a+b)(1)(5))
  }
}
