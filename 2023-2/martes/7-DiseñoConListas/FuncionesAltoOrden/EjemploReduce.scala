/**
 * Ejemplo de uso de reduce
 * @author: Carlos Delgado
 * @date: 10/10/2023
 */

object EjemploReduce {
  def main(args: Array[String]) {
    val lista = List(1, 2, 3, 4, 5)
    val resultado = lista.reduce((x, y) => x + y)
    println(resultado)
    println(lista.reduce((x, y) => x)) // Devuelve el ultimo elemento
    println(lista.reduce((x, y) => y)) // Devuelve el acumulador inicial
    println(List(1).reduce((x, y) => x+y))

    println(List(1,2,3,4,5,6) reduce ( (x,y)=>x*y))
    //Promedio
    println((List(1,2,3,4,5,6) reduce ((x,y)=>x+y))/List(1,2,3,4,5,6).length)
    //Maximo
    println(List(1,2,3,4,5,6) reduce ((x,y)=>if(x>y) x else y))
    //Reduceleft ejemplo
    println(List(1,2,3,4,5,6) reduceLeft ((x,y)=>x+y))
    //Foldleft ejemplo
    println((List(1,2,3,4,5,6) foldLeft 0)((x,y)=>x+y))
    println((List(1,2,3,4,5,6) foldLeft 1)((x,y)=>x*y))
    //ReduceRight ejemplo
    println(List(1,2,3,4,5,6) reduceRight ((x,y)=>x+y))
    //FoldRight ejemplo
    println((List(1,2,3,4,5,6) foldRight 0)((x,y)=>x+y))
    println((List(1,2,3,4,5,6) foldRight 1)((x,y)=>x*y))
  }
}
