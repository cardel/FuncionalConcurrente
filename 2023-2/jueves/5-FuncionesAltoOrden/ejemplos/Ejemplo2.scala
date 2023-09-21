/**
 * Ejemplo de la clase 21 de Sep
 * Ejemplo de la suma, funciones alto orden y funciona anónimas
 * @author Carlos Delgado
 * @date 21 de Sep de 2023
 * @version 1.0
 */

object Ejemplo2 {
 
 
  def sumaEnteros(a:Int, b:Int):Int = {
    if (a>b) 0
    else a + sumaEnteros(a+1,b)
  }

  def sumaEnterosCuadrados(a:Int, b:Int):Int = {
    if (a>b) 0
    else a*a + sumaEnterosCuadrados(a+1,b)
  }

  def sumaAlternada(a:Int, b:Int): Int = {
    if (a>b) 0
    else a*a + sumaAlternada(a+2,b)
  }

  def sumaGenerica(f:(Int=>Int), inc:(Int=>Int), a:Int, b:Int): Int = {
   if (a>b) 0
    else f(a) + sumaGenerica(f, inc, inc(a),b)
  }

  def operacionGenerica(f:(Int=>Int), inc:(Int=>Int), op:(Int,Int)=>Int, a:Int, b:Int, acc:Int=0):Int = {
    if (a>b) acc
    else op(f(a), operacionGenerica(f, inc, op, inc(a), b, acc))
  }

  def main(args:Array[String]): Unit = {
    println("La suma de los enteros entre 1 y 5 es: " + sumaEnteros(1,5))
    println("La suma de los cuadrados entre 1 y 10 es: " + sumaEnterosCuadrados(1,10))
    println("La suma alternada de cuadrados entre 1 y 10 es: " + sumaAlternada(1,10))
    println("La suma de los enteros entre 1 y 5 es. " + sumaGenerica((x:Int)=>x,(x)=>x+1,1,5))
    println("La suma de los cuadrados entre 1 y 10 es: " + sumaGenerica(x=>x*x, x=>x+1, 1,10))
    println("La suma alternada de los cuadrados entre y 10 es: " + sumaGenerica(x=>x*x, x=>x+2, 1, 10))
    
    println("La suma de los enteros entre 1 y 5 es. " + operacionGenerica(x=>x,x=>x+1,(x:Int,y:Int)=>x+y,1,5))
    println("La suma de los cuadrados entre 1 y 10 es: " + operacionGenerica(x=>x*x, x=>x+1, (x,y)=>x+y, 1,10))
    println("La suma alternada de los cuadrados entre y 10 es: " + operacionGenerica(x=>x*x, x=>x+2, (a,b)=>a+b, 1, 10))
    println("La multiplicación entre 1 y 10 es: " + operacionGenerica(x=>x, x=>x+1, (x,y)=>x*y, 1, 10, 1))
  }
}
