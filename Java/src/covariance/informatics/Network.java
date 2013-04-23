package covariance.informatics;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class Network extends AbsGraph
{

    public Network(String name)
    {
        super(name);
    }

    public void addVertex(Node a)
    {
        super.addVertex(a);
    }
    
    public void addEdge(Link b, Node a1, Node a2)
    {
        super.addEdge(b, a1, a2);
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((Node) v);
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
            addEdge((Link) a, (Node) v1, (Node) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
