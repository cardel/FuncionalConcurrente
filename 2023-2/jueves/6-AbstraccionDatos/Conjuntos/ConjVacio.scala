/**
 * Esta clase implementa un conjunto vacio
 */

object ConjVacio extends ConjEnt {
    def pertenece(x: Int): Boolean = false
    def insertar(x: Int): ConjEnt = new ConjNoVacio(x,ConjVacio, ConjVacio)
    override def toString(): String = ""
}
