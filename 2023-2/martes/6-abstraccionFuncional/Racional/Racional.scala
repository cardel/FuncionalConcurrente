/**
 * Esta clase representa un número racional en Scala
 * @author Carlos Delgado
 * @date 26 de Sep de 2023
 */

class Racional(x:Int, y:Int) {
  require(y!=0, "El denominador no puede ser cero")
  private def mcd(a:Int,b:Int) : Int = {
    if(b==0) a else mcd(b,a%b)
  }
  val m = mcd(x,y) //Llamado por valor, por eficiencia
  def numer = x/m
  def deno = y/m

  def suma(r:Racional):Racional = {
    new Racional(numer*r.deno + r.numer*deno, deno*r.deno)
  }

  def resta(r:Racional):Racional = {
    new Racional(numer*r.deno - r.numer*deno, deno*r.deno)
  }

  def multiplicacion(r:Racional):Racional = {
    new Racional(numer*r.numer, deno*r.deno)
  }

  def division(r:Racional):Racional = {
    new Racional(numer*r.deno, deno*r.numer)
  }
  
  def representacion():String = this.toString

  override def toString = numer+"/"+deno
  
  def menorQue(r:Racional):Boolean = {
    this.numer*r.deno < r.numer*this.deno
  }
  def max(r:Racional):Racional = {
    if(this.menorQue(r)) r else this
  }


}
