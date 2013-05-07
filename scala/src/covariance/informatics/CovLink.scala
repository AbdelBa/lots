package covariance.informatics

import covariance.abs.AbsEdge
import covariance.abs.AbsVertex

class CovLink extends AbsEdge {
  def bindVertice(v1: CovNode, v2: CovNode): Unit = {
    super.bindVertice(v1, v2)
  }

  override def bindVertice(a1: AbsVertex, a2: AbsVertex): Unit = {
    try {
      bindVertice(a1.asInstanceOf[CovNode], a2.asInstanceOf[CovNode])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
