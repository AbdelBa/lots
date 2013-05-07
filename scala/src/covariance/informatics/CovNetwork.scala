package covariance.informatics

import covariance.abs.AbsEdge
import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovNetwork(name:String) extends AbsGraph("Network " + name) {
  
  def addVertex(a: CovNode): Unit = {
    super.addVertex(a)
  }
  def addEdge(b: CovLink, a1: CovNode, a2: CovNode): Unit = {
    super.addEdge(b, a1, a2)
  }

  override def addVertex(v: AbsVertex): Unit = {
    try {
      addVertex(v.asInstanceOf[CovNode])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  override def addEdge(a: AbsEdge, v1: AbsVertex, v2: AbsVertex): Unit = {
    try {
      addEdge(a.asInstanceOf[CovLink], v1.asInstanceOf[CovNode], v2.asInstanceOf[CovNode])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
