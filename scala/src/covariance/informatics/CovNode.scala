package covariance.informatics

import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovNode(label: Integer) extends AbsVertex(label) {

  def setGraph(g: CovNetwork): Unit = {
    super.setGraph(g)
  }

  override def setGraph(g: AbsGraph): Unit = {
    try {
      setGraph(g.asInstanceOf[CovNetwork])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
