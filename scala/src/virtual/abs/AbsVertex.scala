package virtual.abs

import scala.collection.mutable.HashSet

class AbsVertex(private var label: Integer) {

  type G <: AbsGraph
  type V <: AbsVertex
  type E <: AbsEdge

  def unbindGraph(): Unit = {
    incidentEdges.foreach(e => graph.removeEdge(e));

    this.graph = null.asInstanceOf[G]
  }

  def getGraph: G = graph

  def setGraph(g: G): Unit = {
    if (graph != null)
      unbindGraph()

    this.graph = g
  }

  def getIncidentEdges: HashSet[E] = incidentEdges

  override def toString: String = label.toString()

  private var incidentEdges: HashSet[E] = new HashSet[E]
  private var graph: G = _
}
