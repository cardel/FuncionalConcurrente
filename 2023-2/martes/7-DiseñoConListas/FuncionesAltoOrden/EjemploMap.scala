/**
 * Ejemplo de map
 * @author Carlos Delgado
 * @date 10/Oct/2023
 */

object EjemploMap {
  def main(args: Array[String]) {
    val lista = List(1, 2, 3, 4, 5)
    val lista2 = lista.map(x => x * 2)
    println(lista2)
    println(lista map (x => x * 2))

    val lista3 = List("a", "b", "c", "d", "e")
    println(lista3.map(x => x.toUpperCase))

    val lista4 = List("firulaes", "fandangos", "farandula", "faraon")
    println(lista4.map(x => x.length))
    println(lista4.map(x => x.toUpperCase))
  }
}
