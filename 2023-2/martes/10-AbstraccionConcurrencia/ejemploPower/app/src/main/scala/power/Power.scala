/**
 * EJemplo de norma-p en scala
 * @author Carlos Delgado
 * @date 14/11/2023
 */
package power
import common._
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

  def normaPCuatro(a:Array[Int], p:Double): Double = {
    val m:Int = a.length/4
    val (sum1, sum2, sum3, sum4) = parallel(sumSegmento(a,p,0,m), sumSegmento(a,p,m,2*m), sumSegmento(a,p,2*m,3*m), sumSegmento(a,p,3*m, a.length))
    power(sum1 + sum2 + sum3 + sum4, 1/p)
  }

  def normaPCuatroTask(a:Array[Int], p:Double) : Double = {
    val m:Int = a.length/4 
    val sum1 = task (sumSegmento(a,p,0,m))
    val sum2 = task (sumSegmento(a,p,m,2*m))
    val sum3 = task (sumSegmento(a,p,2*m,3*m))
    val sum4 = task (sumSegmento(a,p,3*m, a.length))
    power(sum1.join()+sum2.join()+sum3.join()+sum4.join(),1/p)
  }

  //Norma lanzando un numero ilimitado de hilos
  def segmentRec(a:Array[Int], p:Double, s:Int, t:Int): Double = {
    val limite = 2.0
    if (t -s < limite) 
      sumSegmento(a,p,s,t)
    else {
      val m:Int = s + (t-s)/2 
      val (sum1, sum2) = parallel(segmentRec(a,p,s,m),segmentRec(a,p,m,t))
      sum1 + sum2
    }
  }

  def normaPParOpt(a:Array[Int], p:Double): Double = {
    val m:Int = a.length/2
    val (sum1, sum2) = parallel(segmentRec(a,p,0,m), segmentRec(a,p,m,a.length))
    power(sum1 + sum2, 1/p)
  }

  def pNormRec(a:Array[Int], p:Double): Double = 
    power(segmentRec(a,p,0,a.length),1/p)

  def main(args: Array[String]): Unit = {
    val lst = (1 to 100000000).toArray
    // n*(n+1)(2n+1)/6 = 10*11*21/6 = 385
    val p = 2.0
    val t = System.currentTimeMillis()
    println("La norma-2 del vector es: " + normaPSeq(lst,p))
    println("Tiempo ejecución secuencial: " + (System.currentTimeMillis() - t))
    val t2 = System.currentTimeMillis()
    println("La norma-2 del vector paralela es: " + normaPPar(lst,p))
    println("Tiempo ejecución paralela: " + (System.currentTimeMillis() - t2)) 
    val t3 = System.currentTimeMillis()
    println("La norma-2 del vector paralelo es "+ pNormRec(lst,p))
    println("Tiempo de ejecución paralela muchos hilos " + (System.currentTimeMillis()-t3))
    val t4 = System.currentTimeMillis()
    println("La norma-2 del vector en 4 hilos es " + normaPCuatro(lst,p))
    println("El tiempo de ejecución 4 hilos " + (System.currentTimeMillis() - t4))
    
    val t5 = System.currentTimeMillis()
    println("La norma-2 del vector en 4 tareas es " + normaPCuatroTask(lst,p))
    println("El tiempo de ejecución 4 tareas " + (System.currentTimeMillis() - t5))
  }


}
