package covariance.chemistry;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class CovBond extends AbsEdge
{
    public CovBond(AbsVertex v1, AbsVertex v2)
    {
        super(v1, v2);
    }

    public CovBond()
    {
    }

    public void bindVertice(CovAtom v1, CovAtom v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex a1, AbsVertex a2)
    {        
        try
        {
            bindVertice((CovAtom) a1, (CovAtom) a2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
