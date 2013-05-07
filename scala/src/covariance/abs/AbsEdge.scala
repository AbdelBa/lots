package covariance.abs

import exceptions.NotSameGraphException

abstract class AbsEdge {

  def this(v1: AbsVertex, v2: AbsVertex) = {
    this()
    this.x = v1
    this.y = v2
  }

  def unbindGraph(): Unit = {
    this.graph = null
    unbindVertice()
  }

  def bindVertice(v1: AbsVertex, v2: AbsVertex): Unit = {
    try {
      if (!(v1.getGraph == v2.getGraph) || v1.getGraph == null || v2.getGraph == null)
        throw new NotSameGraphException("Les 2 sommets ne sont pas dans le mme graphe.")

      if (!(graph == v1.getGraph) && graph != null)
        throw new NotSameGraphException("L'arete n'est pas dans le mme graphe que les 2 sommets.")

      if (graph == null) {
        graph = v1.getGraph
        graph.getEdges.add(this)
      }

      this.x = v1
      this.y = v2
      v1.getIncidentEdges.add(this)
      v2.getIncidentEdges.add(this)
    } catch {
      case e: Exception =>
        e.printStackTrace()

    }
  }

  def unbindVertice(): Unit = {
    x.getIncidentEdges.remove(this)
    x = null
    y.getIncidentEdges.remove(this)
    y = null
  }

  override def toString: String = String.format("(%s, %s)", x, y)

  private var graph: AbsGraph = null
  private var x: AbsVertex = null
  private var y: AbsVertex = null
}
