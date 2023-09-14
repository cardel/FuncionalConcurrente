package recursionarbol

class Factorial {

  /**
   * Calcula el factorial de un número usando recursión de arbol
   * @param n
   * @return factorial de n
   */
  def factorial(n: Int): Int = {
    def producto(a: Int, b: Int) : Int = {
      if (a > b) 1
      else {
        if (a == b - 1) a
        else {
          val m = a + (b-a)/2
          producto(a, m) * producto(m, b)
        }
      }
    }
    producto(1, n+1)
  }

}
