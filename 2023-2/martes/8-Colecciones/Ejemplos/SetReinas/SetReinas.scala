/**
 * Ejemplo de uso de la clase Set para resolver el problema de las N-Reinas
 * @author: Carlos Delgado
 * @date: 17 de Oct de 2023
 */

object SetReinas {

  /**
    * Comprueba si la reina colocada en la columna col de la fila reinas.length + dist ataca a alguna reina colocadas en reinas
    * @param col:Int Columna de la reina a colocar
    * @param dist:Int Distancia de la reina a colocar
    * @param reinas:List[Int] Columnas de las reinas colocadas
    */
   def ataques(col:Int, dist:Int, reinas:List[Int]):Boolean = {
    reinas match {
      case Nil => false
      case r::or => {
        col == r || (col - r).abs == dist || ataques(col, dist + 1, or)
      }
    }
   }

   /**
    * Devuelve true si colocar reina de la fila reinas.lenght + 1 en la columna, sabiendo que las otras reinas están ubicadas en la lista reinas es seguro
    * @param col:Int
    * @param reinas:List[Int]
    */
   def esSeguro(col:Int, reinas:List[Int]):Boolean = {
    !ataques(col, 1, reinas) //Arrancamos en 1 porque la misma reina no se valida
   }
    
   /**
    * Esta función coloca reinas hasta la fila k de forma segura
    * @param k:Int
    * @return Set[List[Int]]
    */
    def coloqueReinasHastaLaFila(k:Int):Set[List[Int]] = {
      if (k == 0) Set(List())
      else {
        for {
          reinas <- coloqueReinasHastaLaFila(k - 1) //Colocamos las reinas hasta la fila k - 1
          col <- 1 to k //Colocamos la reina en la columna col
          /** Yo necesito validar cada uno de los elementos de reinas (que se un setter
           *  listas, necesito validar para una de las columnas
          */
          for {
            r <- reinas
            if col forall esSeguro(_, r)
          } yield r

          //Si es seguro
        } yield col::reinas //La coloco
      }
    }

    def main(args:Array[String]):Unit = {
      println(coloqueReinasHastaLaFila(4).foreach(println))
      println(coloqueReinasHastaLaFila(8).foreach(println))
    }
}
