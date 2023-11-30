file://<WORKSPACE>/src/main/scala/benchmarking/ScalaMeter.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 377
uri: file://<WORKSPACE>/src/main/scala/benchmarking/ScalaMeter.scala
text:
```scala
/**
* Clase para analisis de tiempo de ejecucion de algoritmos.
* @author Carlos Delgado
* @note 30-Nov-2023
*/
package benchmarking
import common._
import org.scalameter.measure
import org.scalameter.withWarmer
import org.scalameter.Warmer.Default
import scala.util.Random

class ScalaMeter {

  def prueba(): Unit = {
    val a = new Random()
    val l = Array.fill(1000000)(@@
    for (i <- 1 to 100) {
      val k = withWarmer (new Default) measure {
        (1 to 1000000).map(_ => a.nextInt()).toArray.sorted
     }
      println(k)
    }

  }

}

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.countParams(Signatures.scala:501)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:186)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:94)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:63)
	scala.meta.internal.pc.MetalsSignatures$.signatures(MetalsSignatures.scala:17)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:51)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:375)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0