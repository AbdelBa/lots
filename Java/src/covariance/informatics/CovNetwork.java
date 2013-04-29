package covariance.informatics;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class CovNetwork extends AbsGraph
{

    public CovNetwork(String name)
    {
        super("Network " + name);
    }

    public void addVertex(CovNode a)
    {
        super.addVertex(a);
    }
    
    public void addEdge(CovLink b, CovNode a1, CovNode a2)
    {
        super.addEdge(b, a1, a2);
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((CovNode) v);
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
            addEdge((CovLink) a, (CovNode) v1, (CovNode) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
