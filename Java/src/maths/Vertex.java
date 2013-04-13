package maths;

import java.util.HashSet;

/*
 * Invariants - les aretes incidentes sont dans le même graphe que this
 */
public class Vertex
{
    private Character label;
    private HashSet<Edge> incidentEdges;
    private Graph graph;

    public Vertex(Character label)
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

    public String toString()
    {
        return Character.toString(label);
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

}
