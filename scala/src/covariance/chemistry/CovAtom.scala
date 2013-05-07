package covariance.chemistry

import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovAtom(label:Integer) extends AbsVertex(label) {

  def setGraph(m: CovMolecule): Unit = {
    super.setGraph(m)
  }

  override def setGraph(g: AbsGraph): Unit = {
    try {
      setGraph(g.asInstanceOf[CovMolecule])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
