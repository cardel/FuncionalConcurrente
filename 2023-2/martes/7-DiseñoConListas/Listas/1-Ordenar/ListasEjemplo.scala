/**
 * Ejemplo de patrones
 * @autor Carlos Delgado
 * @date 10/Oct/2023
 */

class ListasEjemplo {

  def sumarLista3(lst:List[Int]):Int = lst match {
    case a :: b :: c :: ys => a + b + c
    case _ => 0
  }
}
