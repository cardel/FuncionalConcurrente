package producto

class Producto {

  /**
   * Calcula el factorial usando una estrategia de dividir los productos por mitades hasta dejar los casos triviales (multiplicación de un sólo numero)
   * @param n es el numero a calcular el factorial
   */
    def factorial(n:Int): Int = {
      def producto(a:Int, b:Int): Int = {
        if (a >= b) 1
        else {
          val m:Int = a+(b-a)/2
          if (a==b-1) a
          else producto(a,m)*producto(m,b)
        }
      }
      producto(1,n+1)
    }
}
