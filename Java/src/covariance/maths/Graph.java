package covariance.maths;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;


public class Graph extends AbsGraph
{
    public Graph(String name)
    {
        super(name);
    }

    public void addVertex(Vertex v)
    {
        super.addVertex(v);        
    }

    public void addEdge(Edge e, Vertex v1, Vertex v2)
    {
        super.addEdge(e, v1, v2);        
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((Vertex) v);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void addEdge(AbsEdge a, AbsVertex v1, AbsVertex v2)
    {
        try
        {
            addEdge((Edge) a, (Vertex) v1, (Vertex) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}