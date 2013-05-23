package virtual.abs

import exceptions.NotSameGraphException

abstract class AbsEdge {

  type G <: AbsGraph
  type V <: AbsVertex
  type E <: AbsEdge
  
  def this(v1: AbsVertex, v2: AbsVertex) = {
    this()
    this.x = v1.asInstanceOf[V]
    this.y = v2.asInstanceOf[V]
  }

  def unbindGraph(): Unit = {
    this.graph = null.asInstanceOf[G]
    unbindVertice()
  }

  def bindVertice(v1: V, v2: V): Unit = {
    try {
      if (!(v1.getGraph == v2.getGraph) || v1.getGraph == null || v2.getGraph == null)
        throw new NotSameGraphException("Les 2 sommets ne sont pas dans le mme graphe.")

      if (!(graph == v1.getGraph) && graph != null)
        throw new NotSameGraphException("L'arete n'est pas dans le mme graphe que les 2 sommets.")

      if (graph == null) {
        graph = v1.getGraph.asInstanceOf[G]
        graph.getEdges.add(this.asInstanceOf[graph.E])
      }

      this.x = v1
      this.y = v2
      v1.getIncidentEdges.add(this.asInstanceOf[v1.E])
      v2.getIncidentEdges.add(this.asInstanceOf[v2.E])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  def unbindVertice(): Unit = {
    x.getIncidentEdges.remove(this.asInstanceOf[x.E])
    x = null.asInstanceOf[V]
    y.getIncidentEdges.remove(this.asInstanceOf[y.E])
    y = null.asInstanceOf[V]
  }

  override def toString: String = String.format("(%s, %s)", x, y)

  private var x: V = _
  private var y: V = _
  private var graph: G = _
}
