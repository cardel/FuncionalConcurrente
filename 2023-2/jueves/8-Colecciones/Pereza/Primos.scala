/**
 * Generador de numeros primos
 * @author Carlos Delgado
 * @date 02 de Nov de 2023
 */

object Primos {
  
  def generadorPrimos(i:Int, f:Int):List[Int] = {
    val divisores = 2 to Math.sqrt(f).toInt + 1
    (i to f).filter(n => divisores.forall(n % _ != 0)).toList

  }

  def generadorPrimosPerezoso(i:Int, f:Int):LazyList[Int] = {
    if (i >= f) LazyList.empty
    else LazyList.cons(i, generadorPrimosPerezoso(i+1, f))
      
  }

  def esPrimo(n:Int):Boolean = {
    val rango = 2 to Math.sqrt(n).toInt + 1
    rango.forall(n % _ != 0)
  }

  def numeroNaturales(n:Int):LazyList[Int] = {
    LazyList.cons(n, numeroNaturales(n+1))
  }

  def main(args: Array[String]): Unit = {
    val ge = generadorPrimosPerezoso(1000, 10000) filter esPrimo
    println(ge)
    println(ge(1))
    println(ge)
    println(ge(1))
    println(ge)
    println(ge(11))
    println(ge)
    val naturales = numeroNaturales(0)
    println(naturales)
    println(naturales(20))
    println(naturales)
    println(naturales(10))
    println(naturales)
  }
}
