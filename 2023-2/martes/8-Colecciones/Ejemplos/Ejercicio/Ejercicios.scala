/**
 * Ejercicios en clase
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object Ejercicios {

  /**
   * primo : Int -> Boolean
   * Determina si un número entero es un número primo
   * @param n Int
   * @return Boolean
   */
    def primo(n: Int): Boolean = {
      val rango = 2 to (Math.sqrt(n) + 1).toInt //Rango desde 2 hasta la raíz cuadrada de n
      val divisores = rango.filter(x => n % x == 0) //Filtramos los divisores de n
      divisores.length == 0 //Si no hay divisores, es primo
    }

    /** 
     *  primosB : Int -> Boolean
     *  Determina si un número entero es un número primo
     *  @param n Int
     *  @return Boolean
     */
    def primosB(n:Int):Boolean = {
      val rango = 2 to (Math.sqrt(n) + 1).toInt //Rango desde 2 hasta la raíz cuadrada de n
      val divisores = rango.map(x => n % x) //Aplicamos un map para obtener los residuos de la división
      divisores forall (x => x != 0) //Todos los residuos deben ser diferentes de 0
    }

    /**
     * Generamos la secuencia desde (i,j) con 1 <= j < i < n, de tal manera i+j un número primero
     * @param n Int
     * @return List[(Int,Int)]
     */
    def generarSecuencia(n:Int):List[(Int,Int)] = {
      val rango = 1 until n
      val secuencia = rango.flatMap(i => (1 until i).map(j => (i,j)))
      secuencia.filter({case (x,y) => primo(x+y)}).toList
    }
    
    
    /**
     * Generamos la secuencia desde (i,j) con 1 <= j < i < n, de tal manera i+j un número primero
     * @param n Int
     * @return List[(Int,Int)]
     */
    def generarSecuenciaFor(n:Int):List[(Int,Int)] = {
      (for {
        i <- 1 until n
        j <- 1 until i
        if primo(i+j)
      } yield (i,j)).toList

    }

    def main(arr:Array[String]):Unit = {
      val primos = (1 to 1000).filter(x => primo(x))
      println(primos)
      println((1 to 1000).filter(x => primosB(x)))
      println(generarSecuencia(10))
      println(generarSecuenciaFor(10))
    }
}
