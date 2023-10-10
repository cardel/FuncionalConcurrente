/**
 * Archivo main de insertion sort
 * @autor Carlos Delgado
 * @date 10/Oct/2023
 */

object Main {

  def main(args: Array[String]): Unit = {
    val insertionSort = new InsertionSort()
    val lista = List(5, 3, 2, 1, 4)
    println("Lista desordenada: " + lista)
    println("Lista ordenada: " + insertionSort.iSort(lista))
    
    val listasEjemplo = new ListasEjemplo()
    val lista2 = List(10,20,30)
    println("Suma de los primeros 3 elementos de la lista: " + listasEjemplo.sumarLista3(lista2))
  }
}
