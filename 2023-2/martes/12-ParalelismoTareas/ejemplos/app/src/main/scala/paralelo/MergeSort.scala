/**
* Ordenamiento paralelo de Mergesot
* @author Carlos Andres Delgado
* @note 28-Nov-2023
*/ 
package paralelo

import common._

class MergeSort {

  /**
  * El procedimiento merge que recibe dos arreglos ordenados y nos retorna su mezcla ordenada
  */ 
  def merge(v1: Vector[Int], v2: Vector[Int]):Vector[Int] = {
    val n1 = v1.length
    val n2 = v2.length
    if (n1==0) v2 
    else { 
      if (n2==0) v1 
      else if (v1(0) < v2(0)) 
      v1(0) +: merge(v1.slice(1,n1),v2) 
      else v2(0) +: merge(v1,v2.slice(1,n2))
    }
  }
  
  def mergeSortSeq(v:Vector[Int]) : Vector[Int] = {
    val n = v.length
    val m:Int = n/2
    if (n <= 1) v else merge(mergeSortSeq(v.slice(0,m)),mergeSortSeq(v.slice(m,n)))

  }

  def mergeSortPar(maxProf:Int)(prof:Int)(v:Vector[Int]) : Vector[Int] = {
    val n = v.length
    val m:Int = n/2
    if (prof > maxProf) mergeSortSeq(v) else {
      val (v1,v2) = parallel(mergeSortPar(maxProf)(prof+1)(v.slice(0,m)),mergeSortPar(maxProf)(prof+1)(v.slice(m,n)))

    merge(v1,v2)
    }

  }


}
