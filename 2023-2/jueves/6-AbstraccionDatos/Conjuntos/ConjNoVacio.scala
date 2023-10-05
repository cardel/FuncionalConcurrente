/**
 * Esta clase implementa un conjunto no vacio
 * @author Carlos Delgado
 * @date 05 Oct 2023
 */

class ConjNoVacio(elem:Int, hizq:ConjEnt, hder:ConjEnt) extends ConjEnt {
  def pertenece(x: Int): Boolean = {
    if (x == elem) true
    else if (x < elem) hizq.pertenece(x)
    else hder.pertenece(x)
  }

  def insertar(x: Int): ConjEnt = {
    if (x == elem) this
    else if (x < elem) new ConjNoVacio(elem, hizq.insertar(x), hder)
    else new ConjNoVacio(elem, hizq, hder.insertar(x))
  }

  override def toString(): String = {
     " " + hizq.toString + elem + hder.toString
  }

}
