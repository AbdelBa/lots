package covariance.maths;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class CovEdge extends AbsEdge
{
    public CovEdge()
    {
    }

    public CovEdge(AbsVertex v1, AbsVertex v2)
    {
        super.bindVertice(v1, v2);
    }

    public void bindVertice(CovVertex v1, CovVertex v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex v1, AbsVertex v2)
    {        
        try
        {
            bindVertice((CovVertex) v1, (CovVertex) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
