package covariance.chemistry

import covariance.abs.AbsEdge
import covariance.abs.AbsVertex

class CovBond extends AbsEdge {
  def bindVertice(v1: CovAtom, v2: CovAtom): Unit = {
    super.bindVertice(v1, v2)
  }

  override def bindVertice(a1: AbsVertex, a2: AbsVertex): Unit = {
    try {
      bindVertice(a1.asInstanceOf[CovAtom], a2.asInstanceOf[CovAtom])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
