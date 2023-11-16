/**
 * Ejemplo de hilos en Scala
 * @author Carlos A Delgado
 */ 

object EjemploHilos {
  var uniqueNumber = 0

  def getUniqueId():Int = synchronized {
    val id = uniqueNumber+1
    Thread.sleep(1000)
    uniqueNumber = id 
    id
  }


  def main(args: Array[String]) {
    println("Hola desde el hilo principal " + Thread.currentThread.getName)
    val t = hilo {
        println("Hola desde el hilo " + Thread.currentThread.getName)
    }
    for (i <- 0 to 10) {
      val k = hilo {  
        println("El id unico es " + getUniqueId)
      }
    }
  }

  def hilo(cuerpo : => Unit): Thread = {
    val t = new Thread {
      override def run() = cuerpo
    }
    t.start
    t
      
  }
}
