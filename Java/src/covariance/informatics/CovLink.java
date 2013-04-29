package covariance.informatics;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class CovLink extends AbsEdge
{
    public CovLink()
    {
    }
    
    public CovLink(AbsVertex n1, AbsVertex n2)
    {
        super(n1, n2);
    }
    
    public void bindVertice(CovNode v1, CovNode v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex a1, AbsVertex a2)
    {        
        try
        {
            bindVertice((CovNode) a1, (CovNode) a2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
