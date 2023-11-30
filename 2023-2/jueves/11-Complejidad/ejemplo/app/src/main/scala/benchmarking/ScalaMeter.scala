/**
* Clase para analisis de tiempo de ejecucion de algoritmos.
* @author Carlos Delgado
* @note 30-Nov-2023
*/
package benchmarking
import common._
import org.scalameter.measure
import org.scalameter.withWarmer
import org.scalameter.Warmer.Default
import scala.util.Random

class ScalaMeter {

  def prueba(): Unit = {
    val a = new Random()
    val l:Array[Double] = Array.fill(100)(0.0)
    for (i <- 0 until 100) {
      val k = withWarmer (new Default) measure {
        (1 to 1000000).map(_ => a.nextInt()).toArray.sorted
      }
      l(i) = k.value
    
    }

    println(l.sum/100.0) //El tiempo promedio
  }

}
