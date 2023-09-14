package factorial

import scala.annotation.tailrec

class Factorial {


  def factorialRecursivo(n : Int): Int = {
    if (n == 0) 1
    else n * factorialRecursivo(n-1)
  }

  /**
   * Factorial mediante de recursión de cola
   * @param n
   * @return Int factorial de n
   */

  def factorialIterativo(n: Int): Int = {
    @tailrec
    def factoriaIterativoAux(cnt: Int, acc: Int): Int = {
      if (cnt > n) acc
      else factoriaIterativoAux(cnt + 1, acc * cnt)
    }
    factoriaIterativoAux(1, 1)
  }

}
