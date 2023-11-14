/**
 * EJemplo de norma-p en scala
 * @author Carlos Delgado
 * @date 14/11/2023
 */

//Importar librerias para el parallelismo
object Power {
  def power (x: Double, p: Double): Double = {
    math.pow(x,p)
  }
  
  def sumSegmento(a:Array[Int], p:Double, s:Int, t:Int): Double = {
    var i = s
    var sum = 0.0
    while (i < t) {
      sum += power(a(i),p)
      i += 1
    }
    sum
  }

  def normaPSeq(a:Array[Int], p:Double): Double = {
    val m:Int = a.length/2
    val sum = (sumSegmento(a,p,0,m), sumSegmento(a,p,m,a.length))
    power(sum._1 + sum._2, 1/p)
  
  }

  def normaPPar(a:Array[Int], p:Double): Double = {
    val m:Int = a.length/2
    val (sum1, sum2) = parallel(sumSegmento(a,p,0,m), sumSegmento(a,p,m,a.length))
    power(sum1 + sum2, 1/p)
  }

  //Norma optimizada en vectores de tamaño 2
  def segmentRec(a:Array[Int], p:Double, s:Int, t:Int): Double = {
    if (t-s <= 2) {
      sumSegmento(a,p,s,t)
    } else {
      val m:Int = (s+t)/2
      val (sum1, sum2) = parallel(segmentRec(a,p,s,m), segmentRec(a,p,m,t))
      sum1 + sum2
    }

  }

  def normaPParOpt(a:Array[Int], p:Double): Double = {
    val m = a.length/2
    val (sum1, sum2) = parallel(segmentRec(a,p,0,m), segmentRec(a,p,m,a.length))
    power(sum1 + sum2, 1/p)
  }


  def main(args: Array[String]) {
    val lst = (1 to 1000000).toArray
    // n*(n+1)(2n+1)/6 = 10*11*21/6 = 385
    val p = 2.0
    val t = System.currentTimeMillis()
    println("La norma-2 del vector es: " + normaPSeq(lst,p))
    println("Tiempo ejecución secuencial: " + (System.currentTimeMillis() - t))
    val t2 = System.currentTimeMillis()
    println("La norma-2 del vector paralela es: " + normaPPar(lst,p))
    println("Tiempo ejecución paralela: " + (System.currentTimeMillis() - t2)) 
    val t3 = System.currentTimeMillis()
    //println("La norma-2 del vector paralela optimizada es: " + normaPParOpt(lst,p))
    println("Tiempo ejecución paralela optimizada: " + (System.currentTimeMillis() - t3)) 
      

  }


  def parallel[A,B](taskA: => A, taskB: => B): (A,B) = {
    //Generar dos hilos para A y B
    val tA = new Thread {
      override def run() = taskA
    }

    val tB = new Thread {
      override def run() = taskB
    }

    tA.start()
    tB.start()
    //Retorna los valores de taskA y taskB
    (taskA, taskB)

  }

}
