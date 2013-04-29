package generics.abs;

import java.util.HashSet;

@SuppressWarnings("rawtypes")
public abstract class AbsVertex<G extends AbsGraph, V extends AbsVertex, E extends AbsEdge>
{
    private Integer label;
    private HashSet<E> incidentEdges;
    private G graph;

    public AbsVertex(Integer label)
    {
        this.label = label;
        incidentEdges = new HashSet<E>();
    }
    
    @SuppressWarnings("unchecked")
    public void unbindGraph()
    {
        for (E e : incidentEdges)
            graph.removeEdge(e);

        this.graph = null;
    }

    public G getGraph()
    {
        return graph;
    }
            
    public void setGraph(G g)
    {
        if (graph != null) unbindGraph();
        this.graph = g;
    }

    public HashSet<E> getIncidentEdges()
    {
        return incidentEdges;
    }

    public String toString()
    {
        return Integer.toString(label);
    }
}
