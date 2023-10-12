/**
 * Ejemplo de funciones de alto orden con Listas
 * @author Carlos Delgado
 * @date 12/10/2023
 */

object AltoOrden {
  def main(arr:Array[String]):Unit = {
    val lista = List(1,2,3,4,5,6,7,8,9,10)
    println("Lista original: " + lista)
    println("Lista con map: " + lista.map(x => x * 2))
    lista.map(x => 3*x).foreach(println) // Esto se dedica a imprimir cada elemento de la lista
    print("Lista elevada al cuadrado" + lista.map(x => x*x))
    println("Lista con filter: " + lista.filter(x => x % 2 == 0))
    println("Lista con map y filter: " + lista.map(x => x + 5).filter(x => x % 2 == 0))

    // Funciones de reduce
    println("Suma de los elementos de la lista: " + lista.reduce((x,y) => x + y))
    println("Suma de la multiplicacion de los elementos de la lista: " + lista.reduce((x,y) => x * y))
    println("Suma de los elementos de la lista: " + lista.reduceLeft((x,y) => x + y))

    println("Suma de los elementos de la lista: " + lista.reduceRight((x,y) => x + y))

    // Funciones de foldLeft
    println("Suma de los elementos de la lista: " + lista.foldLeft(0)((x,y) => x + y))
    println("Multiplicación de los elementos de la lista: " + lista.foldLeft(1)((x,y) => x * y))

    // Funciones de foldRight
    println("Suma de los elementos de la lista: " + lista.foldRight(0)((x,y) => x + y))
    println("Multiplicación de los elementos de la lista: " + lista.foldRight(1)((x,y) => x * y))

    //Concatenar dos listas
    val listaA = List(1,2,3,4,5)
    val listaB = List(6,7,8,9,10)
    println("Concatenar dos listas: " + listaA.foldRight(listaB)((x,y) => x :: y))

    println("Concatenar dos listas: " + listaA.foldLeft(listaB)((x,y) => x :: y))

  }

}
