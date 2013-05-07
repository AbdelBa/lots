package covariance.chemistry

import covariance.abs.AbsEdge
import covariance.abs.AbsGraph
import covariance.abs.AbsVertex

class CovMolecule(name:String) extends AbsGraph("Molecule " + name) {

  def addVertex(a: CovAtom): Unit = {
    super.addVertex(a)
  }

  def addEdge(b: CovBond, a1: CovAtom, a2: CovAtom): Unit = {
    super.addEdge(b, a1, a2)
  }

  override def addVertex(v: AbsVertex): Unit = {
    try {
      addVertex(v.asInstanceOf[CovAtom])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  override def addEdge(a: AbsEdge, v1: AbsVertex, v2: AbsVertex): Unit = {
    try {
      addEdge(a.asInstanceOf[CovBond], v1.asInstanceOf[CovAtom], v2.asInstanceOf[CovAtom])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

}
