
/**
* Clase Main
* @author Carlos Delgado
* @date 31/Oct/2023
*/

object Main {
  def main(args: Array[String]): Unit = {
  val libros:List[Libro] = List(
    Libro("Fundacion", List("Isaac Asimov")),
    Libro("El señor de los anillos", List("J.R.R. Tolkien")),
    Libro("El nombre del viento", List("Patrick Rothfuss")),
    Libro("El temor de un hombre sabio", List("Patrick Rothfuss")),
    Libro("Vuelta a la fundacion", List("Isaac Asimov")),
    Libro("Segunda fundacion", List("Isaac Asimov")),
    )
  println("Libros: " + libros)
  // Libros que escribio Isaac Asimov
  val res = for(libro <- libros if libro.autores.contains("Isaac Asimov")) yield libro.titulo
  println("Libros de Isaac Asimov: " + res)
  //Libros que tengan la palabra fundacion
  val resB = for(libro <- libros if (libro.titulo.toLowerCase() indexOf "fundacion") != -1) yield libro.titulo
  println("Libros con la palabra fundacion: " + resB)
  //Consultar autores que hayan escrito al menos dos libros 
  val resC = for {
              l1 <- libros
              l2 <- libros
              if l1 != l2
              a1 <- l1.autores
              a2 <- l2.autores
              if a1 == a2
               }
              yield a1

  println("Autores que hayan escrito al menos dos libros: " + resC.distinct)

  }


}
