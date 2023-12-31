/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package ejemplopi
import scala.util.Random
import common._
object Pi {

  def mcCount(iter: Int): Int = {
    val randomX = new Random
    val randomY = new Random
    var hits = 0
    for (i <- 0 until iter) {
      val x = randomX.nextDouble()
      val y = randomY.nextDouble()
      if (x*x + y*y < 1) hits = hits+1
    }
    hits
  }

  def procesoCuatroHilos(iter: Int):Int = {
    val iter4:Int = iter/4 + 1
    val (hits1, hits2, hits3, hits4) = parallel(
      mcCount(iter4),
      mcCount(iter4),
      mcCount(iter4),
      mcCount(iter4)
      )
    hits1+hits2+hits3+hits4
  }


  def main(args: Array[String]): Unit = {
    println("Lanzo 50000 tiros " + mcCount(50000))
    val t1 = System.currentTimeMillis()
    println("Estimo pi " + 4*mcCount(5000000)/5000000.0)
    println("El tiempo para estimar pi con 5000000 es " +(System.currentTimeMillis() - t1))
    val t2 = System.currentTimeMillis()
    println("Estimo pi "+ 4*procesoCuatroHilos(5000000)/5000000.0)
    println("El tiempo para estimar 4 con 5000000 en 4 hilos es "+ (System.currentTimeMillis() - t2))
  }

}
