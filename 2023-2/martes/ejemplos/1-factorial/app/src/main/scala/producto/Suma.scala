package producto

class Suma {

  /**
   * Calcula el predecedor de un número
   * @param n Número entero
   * @return Número entero
   */
  def pred(n: Int): Int = n - 1

  /**
   * Calcula el sucesor de un número
   * @param n Número entero
   * @return Número entero
   */
  def succ(n: Int): Int = n + 1

  /**
   * Suma dos números enteros usando el predecesor y el sucesor usando recursión lineal
   * @param a Número entero
   * @param b Número entero
   * @return Número entero con la suma de a y b
   */
  def suma(a: Int, b: Int): Int = {
    if (a == 0) b
    else succ(suma(pred(a), b))
  }

  /**
   * Suma usando recursión de cola (proceso iterativo)
   * @param a Número entero
   * @param b Número entero
   * @return Número entero con la suma de a y b
   */
  def sumaIterativa(a: Int, b:Int) : Int = {
    if (a==0) b
    else sumaIterativa(pred(a), succ(b))
  }
}
