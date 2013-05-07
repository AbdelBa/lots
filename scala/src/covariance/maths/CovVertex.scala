package covariance.maths

import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovVertex(label: Integer) extends AbsVertex(label) {

  def setGraph(g: CovGraph): Unit = {
    super.setGraph(g)
  }

  override def setGraph(g: AbsGraph): Unit = {
    try {
      setGraph(g.asInstanceOf[CovGraph])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
