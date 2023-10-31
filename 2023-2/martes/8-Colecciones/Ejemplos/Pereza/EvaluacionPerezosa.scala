/**
 * Evaluación perezosa
 * @author: Carlos Delgado 
 * @date: 31-Oct-2023
 */

object EvaluacionPerezosa {
    
    def esPrimo(x:Int):Boolean = {
        (2 to Math.sqrt(x).toInt + 1) forall (x % _ != 0)
    }

    def rangoPerezoso(min:Int, max:Int): LazyList[Int] =
      if (min>=max) LazyList.empty
      else LazyList.cons(min, rangoPerezoso(min+1,max))


    def main(args: Array[String]): Unit = {
      val primos = (rangoPerezoso(1000,10000) filter esPrimo)
      println(primos)
      println(primos(1))
      println(primos)
    }
}

