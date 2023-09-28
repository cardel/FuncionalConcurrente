/**
 * Esta clase permite representar un número racional
 * @author Carlos Delgado
 * @date 28 de Sep de 2023
 */

class Racional(x:Int, y:Int) {
  require(y != 0, "El denominador no puede ser 0")
  def num = x/mcm(x,y)
  def den = y/mcm(x,y)
  private def mcm(a:Int, b:Int):Int = {
    if(a%b == 0) b
    else mcm(b, a%b)
  }

  def suma(r:Racional):Racional = {
    new Racional(num*r.den + den*r.num, den*r.den)
  }
  def mult(r:Racional):Racional = {
    new Racional(num*r.num, den*r.den)
  }
  def resta(r:Racional):Racional = {
    new Racional(num*r.den - den*r.num, den*r.den)
  }
  def div(r:Racional):Racional = {
    new Racional(num*r.den, den*r.num)
  }

  def menorQue(r:Racional):Boolean = {
    num*r.den < den*r.num
  }

  def max(r:Racional):Racional = {
    if(menorQue(r)) r
    else this
  }

  override
  def toString():String = {
    num + "/" + den
  }
}

