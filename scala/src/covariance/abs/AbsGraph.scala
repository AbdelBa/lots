package covariance.abs

import scala.collection.mutable.HashSet

abstract class AbsGraph(private var name:String) {
  
  def addVertex(v: AbsVertex): Unit = {
    this.vertice.add(v)
    v.setGraph(this)
  }

  def removeVertex(v: AbsVertex): Unit = {
    this.vertice.remove(v)
    v.unbindGraph()
  }

  def addEdge(e: AbsEdge, v1: AbsVertex, v2: AbsVertex): Unit = {
    e.bindVertice(v1, v2)
    this.edges.add(e)
  }

  def removeEdge(e: AbsEdge): Unit = {
    this.edges.remove(e)
    e.unbindGraph()
  }

  def getEdges: HashSet[AbsEdge] = edges

  override def toString: String = String.format("Covariant %s \n\tV = %s \n\tE = %s", name, vertice, edges).replace('[', '{').replace(']', '}')
  
  private var vertice: HashSet[AbsVertex] = new HashSet[AbsVertex]
  private var edges: HashSet[AbsEdge] = new HashSet[AbsEdge]
}
