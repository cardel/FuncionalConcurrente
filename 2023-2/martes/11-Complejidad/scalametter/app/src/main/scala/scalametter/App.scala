/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package scalametter

import org.scalameter.measure
import org.scalameter.withWarmer
import org.scalameter.Warmer

object App {
  def main(args: Array[String]): Unit = {
    println(
      measure{
        (1 to 100000000).toArray
      }
      )
    
    println(
      withWarmer(new Warmer.Default) measure {
        (1 to 100000000).toArray
      }
      )



  }

}
