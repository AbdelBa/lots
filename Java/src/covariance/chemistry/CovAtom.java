package covariance.chemistry;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class CovAtom extends AbsVertex
{
    public CovAtom(Integer label)
    {
        super(label);
    }

    public void setGraph(CovMolecule m)
    {
        super.setGraph(m);
    }

    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((CovMolecule) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
