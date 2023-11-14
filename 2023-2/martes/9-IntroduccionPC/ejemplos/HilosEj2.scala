/**
* Ejemplo de hilos en Scala
* @author Carlos Delgado
* @date 14/11/2023
*/

object HilosEj2 {
  
  var uidCount = 0L

  def getUniqueId() = synchronized { 
    val freshUid = uidCount + 1
    Thread.sleep(1000)
    uidCount = freshUid
    freshUid
  }

  def main(args: Array[String]): Unit = {
      //Hilo para cada uno de los 10 valores
      for (i <- 1 to 10) {
        val t = hilos {
          val uids = getUniqueId()
          println(uids)
        }
      }
      println("original" + uidCount)
      Thread.sleep(10000)
      println("final" + uidCount)
        

  }

  //Definir hilos
  def hilos(body: => Unit): Thread = {
    val t = new Thread {
      override def run() = body
    }
    t.start()
    t
  }
}
