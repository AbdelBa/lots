package covariance.maths;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class Edge extends AbsEdge
{
    public Edge()
    {
    }

    public Edge(AbsVertex v1, AbsVertex v2)
    {
        super.bindVertice(v1, v2);
    }

    public void bindVertice(Vertex v1, Vertex v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex v1, AbsVertex v2)
    {        
        try
        {
            bindVertice((Vertex) v1, (Vertex) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
