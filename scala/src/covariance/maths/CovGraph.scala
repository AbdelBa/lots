package covariance.maths

import covariance.abs.AbsEdge
import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovGraph(name: String) extends AbsGraph("Graph " + name) {

  def addVertex(v: CovVertex): Unit = {
    super.addVertex(v)
  }

  def addEdge(e: CovEdge, v1: CovVertex, v2: CovVertex): Unit = {
    super.addEdge(e, v1, v2)
  }

  override def addVertex(v: AbsVertex): Unit = {
    try {
      addVertex(v.asInstanceOf[CovVertex])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  override def addEdge(a: AbsEdge, v1: AbsVertex, v2: AbsVertex): Unit = {
    try {
      addEdge(a.asInstanceOf[CovEdge], v1.asInstanceOf[CovVertex], v2.asInstanceOf[CovVertex])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
