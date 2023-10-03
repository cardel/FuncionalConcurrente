/**
 * Implementación del conjunto no vacio
 * @author Carlos Delgado
 * @date 03 de Oct de 2023
 */

class NoVacio (x: Int, izq: ConjEnt, der: ConjEnt) extends ConjEnt {
  def pertenece(x: Int): Boolean = {
    if (x == this.x) true
    else if (x < this.x) izq.pertenece(x)
    else der.pertenece(x)
  }

  def insertar(x: Int): ConjEnt = {
    if (this.x == x) this
    else if (x < this.x) new NoVacio(this.x, izq.insertar(x), der)
    else new NoVacio(this.x, izq, der.insertar(x))
  }
  
  override def toString():String = {
    izq.toString() + " " + x + " " + der.toString()
  }

}
