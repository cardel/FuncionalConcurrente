/**
 * Ejemplo de generador de Personas
 * @author Carlos Delgado
 * @date 17/Oct/2023
 */

object EjemplosPersonas {
  case class Persona(nombre: String, edad: Int)

  def main(args: Array[String]): Unit = {
    val personas = for (i <- 1 to 10) yield Persona("Persona " + i, i * 10)
    println(personas)
    println(personas.filter(x => x.edad > 50))
    println(personas.filter(_.edad > 50).map(_.nombre))
  }


}
