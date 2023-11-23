/**
 *
 * Expermento para calcular PI
 * @author Carlos Andres Delgado
 * @note 23 de Noviembre de 2023
*/ 
package montecarlo
import scala.util.Random
import common._
class MonteCarlo {

  def lanzarExperimento(n:Double) = {
    var hits:Int = 0
    val a = new Random
    val b = new Random
    for (i <- 0 until n.toInt) {
      val x = (a.nextDouble())*2.0-1.0
      val y = (b.nextDouble())*2.0-1.0
      if (x*x + y*y < 1) hits += 1
    }
    hits
  }

  def lanzarExperimentoParalelo(n:Double):Int = {
    val m:Int = (n/4 + 1).toInt
    val (hi1, hi2, hi3, hi4) = parallel(
      lanzarExperimento(m),
      lanzarExperimento(m),
      lanzarExperimento(m),
      lanzarExperimento(m)
      )
    hi1+hi2+hi3+hi4
  }


}
