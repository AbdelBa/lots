package covariance.abs;

import java.util.HashSet;

public abstract class AbsGraph
{
    private String name;
    private HashSet<AbsVertex> vertice;
    private HashSet<AbsEdge> edges;

    public AbsGraph(String name)
    {
        this.name = name;
        vertice = new HashSet<AbsVertex>();
        edges = new HashSet<AbsEdge>();
    }

    public AbsGraph()
    {
        vertice = new HashSet<AbsVertex>();
        edges = new HashSet<AbsEdge>();
    }

    public void addVertex(AbsVertex v)
    {
        this.vertice.add(v);
        v.setGraph(this);
    }

    public void removeVertex(AbsVertex v)
    {
        this.vertice.remove(v);
        v.unbindGraph();
    }

    public void addEdge(AbsEdge e, AbsVertex v1, AbsVertex v2)
    {
        e.bindVertice(v1, v2);
        this.edges.add(e);
    }

    public void removeEdge(AbsEdge e)
    {
        this.edges.remove(e);
        e.unbindGraph();
    }

    public HashSet<AbsEdge> getEdges()
    {
        return edges;
    }

    public String toString()
    {
        return String.format("%s \n\tV = %s \n\tE = %s", name, vertice, edges)
                .replace('[', '{').replace(']', '}');
    }
}