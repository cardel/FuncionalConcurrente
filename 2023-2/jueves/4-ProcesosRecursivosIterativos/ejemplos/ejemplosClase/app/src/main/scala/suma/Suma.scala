package suma

class Suma {

  /**
   * Función predecesor
   * @param n Int número del que se quiere calcular el predecesor
   * @return Int predecesor de n
   */
  def pred(n: Int): Int = n - 1

  /**
   * Función sucesor succ
   * @param n Int número del que se quiere calcular el sucesor
   * @return Int sucesor de n
   */
  def succ(n: Int): Int = n + 1

  /**
   * Función suma recursiva
   * @param a Int número a sumar
   * @param b Int número a sumar
   * @return Int suma de a y b
   */
  def sumaRecursiva(a: Int, b: Int): Int = {
    if (a == 0) b
    else succ(sumaRecursiva(pred(a), b))
  }

  /**
   * Funcion sumaiterativa
   * Esta función suma dos valores a y b usando recursión de cola
   * @param a Int número a sumar
   * @param b Int número a sumar
   * @return Int suma de a y b
   */
  def sumaIterativa(a: Int, b: Int): Int = {
    if (a == 0) b
    else sumaIterativa(pred(a), succ(b))
  }
}
