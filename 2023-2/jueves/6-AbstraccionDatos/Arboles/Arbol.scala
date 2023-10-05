/**
 * Esta clase implementa un arbol binario de busqueda
 */

class Arbol(dato:Int, hizq:Arbol, hder:Arbol) {

  def insertar(nuevo:Int):Arbol = {
    if (nuevo < dato) {
      if (hizq == null) {
        new Arbol(dato, new Arbol(nuevo,null,null), hder)
      }
      else {
        new Arbol(dato, hizq.insertar(nuevo), hder)
      }
    }
    else {

      if (nuevo > dato) {
        if (hder == null) {
          new Arbol(dato, hizq, new Arbol(nuevo,null,null))
        }
        else {
          new Arbol(dato, hizq, hder.insertar(nuevo))
        }
      }
      
      else {
        this
      }
    }
  }

  override def toString:String = {
    var s:String = ""
    if (hizq == null && hder == null) {
      s = dato.toString
    }
    else {
      if (hizq == null) {
        s = dato + " " + hder + " "
      }
      else{
        if (hder == null) {
          s =  hizq + " " + dato + " "
        }
        else {
          s = dato + " "  + hizq + " " + hder + " "
        }
      }

    }
    s
  }

}
