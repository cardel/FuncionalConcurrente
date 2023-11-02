/**
 *
 * Ejemplo expresiones for 
 * @author Carlos Delgado
 * @date 02 de Nov de 2023
 */ 

case class Persona(nombre:String, edad:Int, hijos:Int)
object Ejemplo1 {

  def main(arr:Array[String]):Unit = {
    val personas = List(new Persona("Carlos",36,0),new Persona("Juan",36,2),new Persona("Maria",36,1),new Persona("Juan",18,10))
    val personaConHijos = for (p <- personas if p.hijos > 0) yield p.nombre
    println(personaConHijos)

    val p:List[Int] = List(1,2,3,4)
    val q:List[Int] = List(2,3,4,5)
    val lst = for ((x,y) <- p zip q) yield x*y
    println(lst.sum)
      
  }


}
