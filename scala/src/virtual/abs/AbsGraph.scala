package virtual.abs

import scala.collection.mutable.HashSet

class AbsGraph(private var name: String) {

  type G <: AbsGraph
  type V <: AbsVertex
  type E <: AbsEdge

  def addVertex(v: V): Unit = {
    this.vertice.add(v)
    v.setGraph(this.asInstanceOf[v.G])
  }

  def removeVertex(v: V): Unit = {
    this.vertice.remove(v)
    v.unbindGraph()
  }

  def addEdge(e: E, v1: V, v2: V): Unit = {
    e.bindVertice(v1.asInstanceOf[e.V], v2.asInstanceOf[e.V])
    this.edges.add(e)
  }

  def removeEdge(e: E): Unit = {
    this.edges.remove(e)
    e.unbindGraph()
  }

  def getEdges: HashSet[E] = edges

  override def toString(): String = String.format("GŽnŽrique %s \n\tV = %s \n\tE = %s", name, vertice, edges).replace('[', '{').replace(']', '}')

  private var vertice: HashSet[V] = new HashSet[V]()
  private var edges: HashSet[E] = new HashSet[E]()
}
