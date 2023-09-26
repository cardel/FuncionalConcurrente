/**
 * Ejemplo de la derivada de las diapositivas
 * @author Carlos Delgado
 * @date 26 de Septiembre de 2023
 **/
object Derivada {
  def main(str: Array[String]):Unit = {
    val puntos:List[Double] = List(1,2,3,4,5,6)
    for (x <- puntos) {
      println("f(x) "+cuadrado(x)+" f'(x) "+derivada(cuadrado, x, 0.00000001))
      println("f(x) "+cuadrado(x)+" f'(x) "+derivadaCurrificadaV1( x, 0.00000001)_)
      val derivadaS = derivadaCurrificadaV1(x, 0.00000001)_
      println("f(x) "+cuadrado(x)+" f'(x) "+derivadaS(cuadrado))
      println("f(x) "+cuadrado(x)+" f'(x) "+derivadaCurrificadaV2(0.00000001)_)
      println("f(x) "+cuadrado(x)+" f'(x) "+derivadaCurrificadaV2(0.00000001)(cuadrado)(x))
    }
  }

  def derivada(f:Double=>Double, x:Double, dx:Double):Double = {
    (f(x+dx)-f(x))/dx
  }
  def derivadaCurrificadaV1(x:Double, dx:Double)(f:Double=>Double):Double = {
    (f(x+dx)-f(x))/dx
  }
  def derivadaCurrificadaV2(dx:Double)(f:Double=>Double)(x:Double):Double = {
    (f(x+dx)-f(x))/dx
  }
  def cuadrado(x:Double):Double = {
    x*x
  }

}
