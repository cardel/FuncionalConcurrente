package listas

class Listas {

  def primerElemento(lista: List[Int]): Int = lista.head

  def segundoElemento(lista: List[Int]): Int = lista.tail.head

  def tercerElemento(lista: List[Int]): Int = lista.tail.tail.head

  /**
   * Suma los elementos de una lista usando recursión lineal (2n llamados)
   * @param lista
   * @return Int con la suma de los elementos de la lista
   */
  def sumarElementos(lista: List[Int]): Int = {
    if (lista.isEmpty) 0
    else lista.head + sumarElementos(lista.tail)
  }

  /**
   * Suma los elementos de una lista usando recursión de cola (n llamados) (proceso iterativo)
   * @param lista
   * @return Int con la suma de los elementos de la lista
   */
  def sumarElementosRecursividadDeCola(lista: List[Int]): Int = {
    def sumarElementosRecursividadDeColaIterativo(lista: List[Int], acumulador: Int): Int = {
      if (lista.isEmpty) acumulador
      else sumarElementosRecursividadDeColaIterativo(lista.tail, acumulador + lista.head)
    }

    sumarElementosRecursividadDeColaIterativo(lista, 0)
  }

  /**
   * Inserta un elemento a una lista al final de la lista
   * @param lista Lista de enteros
   * @return Lista de enteros con el elemento insertado al final
   */
  def insertarElementoFinal(lista: List[Int], elemento: Int): List[Int] = {
    lista :+ elemento
  }

  /**
   * Inserta un elemento a una lista al inicio de la lista
   * @param lista Lista de enteros
   * @return Lista de enteros con el elemento insertado al inicio
   */
  def insertarElementoInicio(lista: List[Int], elemento: Int): List[Int] = {
    elemento +: lista
  }
}
