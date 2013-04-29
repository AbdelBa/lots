package covariance.maths;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;


public class CovGraph extends AbsGraph
{
    public CovGraph(String name)
    {
        super("Graph " + name);
    }

    public void addVertex(CovVertex v)
    {
        super.addVertex(v);        
    }

    public void addEdge(CovEdge e, CovVertex v1, CovVertex v2)
    {
        super.addEdge(e, v1, v2);        
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((CovVertex) v);
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
            addEdge((CovEdge) a, (CovVertex) v1, (CovVertex) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}