package generics.abs

import exceptions.NotSameGraphException

abstract class AbsEdge[G <: AbsGraph[G, V, E], V <: AbsVertex[G, V, E], E <: AbsEdge[G, V, E]] {

  def this(v1: V, v2: V) = {
    this()
    this.x = v1
    this.y = v2
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
        graph.getEdges.add(this.asInstanceOf[E])
      }

      this.x = v1
      this.y = v2
      v1.getIncidentEdges.add(this.asInstanceOf[E])
      v2.getIncidentEdges.add(this.asInstanceOf[E])
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  def unbindVertice(): Unit = {
    x.getIncidentEdges.remove(this.asInstanceOf[E])
    x = null.asInstanceOf[V]
    y.getIncidentEdges.remove(this.asInstanceOf[E])
    y = null.asInstanceOf[V]
  }

  override def toString: String = String.format("(%s, %s)", x, y)
  
  private var x: V = _
  private var y: V = _
  private var graph: G = _
}
