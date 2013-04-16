package maths;

import java.util.HashSet;

/*
 * Invariants - les aretes incidentes sont dans le même graphe que this
 */
public class Vertex
{
    private Integer label;
    private HashSet<Edge> incidentEdges;
    private Graph graph;

    public Vertex(Integer label)
    {
        this.label = label;
        incidentEdges = new HashSet<Edge>();
    }
    
    public void unbindGraph()
    {
        for (Edge e : incidentEdges)
            graph.removeEdge(e);

        this.graph = null;
    }

    public Graph getGraph()
    {
        return graph;
    }
    
    public void setGraph(Graph g)
    {
        if (graph != null) unbindGraph();
        this.graph = g;
    }

    public HashSet<Edge> getIncidentEdges()
    {
        return incidentEdges;
    }

    public String toString()
    {
        return Integer.toString(label);
    }
}
