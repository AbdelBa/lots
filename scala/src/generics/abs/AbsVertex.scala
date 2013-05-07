package generics.abs

import scala.collection.mutable.HashSet

class AbsVertex[G <: AbsGraph[G, V, E], V <: AbsVertex[G, V, E], E <: AbsEdge[G, V, E]](private var label:Integer) {

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

  def getIncidentEdges: HashSet[E] =  incidentEdges

  override def toString: String = label.toString()
 
  private var incidentEdges: HashSet[E] = new HashSet[E]
  private var graph: G = _
}
