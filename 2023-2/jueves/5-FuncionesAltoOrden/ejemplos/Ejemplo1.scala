/**
 * Ejemplo de la clase 21 de Sep
 * Ejemplo de la suma y funciones alto orden
 * @author Carlos Delgado
 * @date 21 de Sep de 2023
 * @version 1.0
 */

object Ejemplo1 {
 
  /*
 * Funciones auxiliares
 */
  def ident(x:Int):Int = x
  def succ(x:Int):Int = x+1
  def sum2(x:Int):Int = x+2
  def cuadrado(x:Int):Int = x*x
  /*
 * Fin de funciones auxilares
 */
 
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
  def main(args:Array[String]): Unit = {
    println("La suma de los enteros entre 1 y 5 es: " + sumaEnteros(1,5))
    println("La suma de los cuadrados entre 1 y 10 es: " + sumaEnterosCuadrados(1,10))
    println("La suma alternada de cuadrados entre 1 y 10 es: " + sumaAlternada(1,10))
    println("La suma de los enteros entre 1 y 5 es. " + sumaGenerica(ident,succ,1,5))
    println("La suma de los cuadrados entre 1 y 10 es: " + sumaGenerica(cuadrado, succ, 1,10))
    println("La suma alternada de los cuadrados entre y 10 es: " + sumaGenerica(cuadrado, sum2, 1, 10))
  }
}
