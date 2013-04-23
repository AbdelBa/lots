package covariance.chemistry;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class Bond extends AbsEdge
{
    public Bond(AbsVertex v1, AbsVertex v2)
    {
        super(v1, v2);
    }

    public Bond()
    {
    }

    public void bindVertice(Atom v1, Atom v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex a1, AbsVertex a2)
    {        
        try
        {
            bindVertice((Atom) a1, (Atom) a2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
