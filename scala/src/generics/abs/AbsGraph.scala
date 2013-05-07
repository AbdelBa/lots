package generics.abs

import scala.collection.mutable.HashSet

class AbsGraph[G <: AbsGraph[G, V, E], V <: AbsVertex[G, V, E], E <: AbsEdge[G, V, E]](private var name:String) {
 
  def addVertex(v: V): Unit = {
    this.vertice.add(v)
    v.setGraph(this.asInstanceOf[G])
  }

  def removeVertex(v: V): Unit = {
    this.vertice.remove(v)
    v.unbindGraph()
  }

  def addEdge(e: E, v1: V, v2: V): Unit = {
    e.bindVertice(v1, v2)
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
