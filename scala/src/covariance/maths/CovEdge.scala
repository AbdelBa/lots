package covariance.maths

import covariance.abs.AbsEdge
import covariance.abs.AbsVertex

class CovEdge extends AbsEdge {

  def bindVertice(v1: CovVertex, v2: CovVertex): Unit = {
    super.bindVertice(v1, v2)
  }

  override def bindVertice(v1: AbsVertex, v2: AbsVertex): Unit = {
    try {
      bindVertice(v1.asInstanceOf[CovVertex], v2.asInstanceOf[CovVertex])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
