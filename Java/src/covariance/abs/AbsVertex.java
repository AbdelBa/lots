package covariance.abs;

import java.util.HashSet;

public abstract class AbsVertex
{
    private Integer label;
    private HashSet<AbsEdge> incidentEdges;
    private AbsGraph graph;

    public AbsVertex(Integer label)
    {
        this.label = label;
        incidentEdges = new HashSet<AbsEdge>();
    }
    
    public void unbindGraph()
    {
        for (AbsEdge e : incidentEdges)
            graph.removeEdge(e);

        this.graph = null;
    }

    public AbsGraph getGraph()
    {
        return graph;
    }
    
    public void setGraph(AbsGraph g)
    {
        if (graph != null) unbindGraph();
        this.graph = g;
    }

    public HashSet<AbsEdge> getIncidentEdges()
    {
        return incidentEdges;
    }

    public String toString()
    {
        return Integer.toString(label);
    }
}
