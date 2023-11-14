/**
 * Ejemplo de hilos en Scala
 * @author Carlos Delgado
*/ 

object Hilos {
  def main(args: Array[String]) {
    println(s"Thread principal: ${Thread.currentThread.getName}")
    //Ejemplo de hilos
    val t = hilos {
      println(s"Thread de ejemplo: ${Thread.currentThread.getName}")
    }

    val t2 = hilos {
      println(s"Thread de ejemplo: ${Thread.currentThread.getName}")
    }
  }

  def hilos(body: => Unit): Thread = {
    val t = new Thread {
      override def run() = body
    }
    t.start()
    t
  }
}
