package covariance.abs

import scala.collection.mutable.HashSet

abstract class AbsVertex(private var label:Integer) {
  
  def unbindGraph(): Unit = {
    incidentEdges.foreach(e => graph.removeEdge(e));
    this.graph = null
  }

  def getGraph: AbsGraph = graph

  def setGraph(g: AbsGraph): Unit = {
    if (graph != null)
      unbindGraph()

    this.graph = g
  }

  def getIncidentEdges: HashSet[AbsEdge] = incidentEdges

  override def toString(): String = label.toString()
  
  private var incidentEdges: HashSet[AbsEdge] = new HashSet[AbsEdge]
  private var graph: AbsGraph = null
}
