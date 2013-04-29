package generics.abs;

import java.util.HashSet;

@SuppressWarnings("rawtypes")
public abstract class AbsGraph<G extends AbsGraph, V extends AbsVertex, E extends AbsEdge>
{
    private String name;
    private HashSet<V> vertice;
    private HashSet<E> edges;

    public AbsGraph(String name)
    {
        this.name = "Generic " + name;
        vertice = new HashSet<V>();
        edges = new HashSet<E>();
    }

    public AbsGraph()
    {
        vertice = new HashSet<V>();
        edges = new HashSet<E>();
    }

    @SuppressWarnings("unchecked")
    public void addVertex(V v)
    {
        this.vertice.add(v);
        v.setGraph(this);
    }

    public void removeVertex(V v)
    {
        this.vertice.remove(v);
        v.unbindGraph();
    }

    @SuppressWarnings("unchecked")
    public void addEdge(E e, V v1, V v2)
    {
        e.bindVertice(v1, v2);
        this.edges.add(e);
    }

    public void removeEdge(E e)
    {
        this.edges.remove(e);
        e.unbindGraph();
    }

    public HashSet<E> getEdges()
    {
        return edges;
    }

    public String toString()
    {
        return String.format("%s \n\tV = %s \n\tE = %s", name, vertice, edges)
                .replace('[', '{').replace(']', '}');
    }
}