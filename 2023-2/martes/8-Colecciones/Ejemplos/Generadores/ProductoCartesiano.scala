/**
 * Ejemplo de producto cartesiano
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object ProductoCartesiano {
  def productoCartesiano(a:List[Int], b:List[Int]):Int = {
    (for {
      (x,y) <- a zip b //Se genera una lista de tuplas (x,y) con los elementos de a y b
    } yield x * y).sum //Se multiplica cada elemento de la tupla y se suman
  }
    
  def main(arr:Array[String]):Unit = {
    val a = List(1,2,3)
    val b = List(4,5,6)
    println(productoCartesiano(a,b))

  }
}
