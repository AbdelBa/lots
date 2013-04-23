package covariance.chemistry;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class Atom extends AbsVertex
{
    public Atom(Integer label)
    {
        super(label);
    }

    public void setGraph(Molecule m)
    {
        super.setGraph(m);
    }

    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((Molecule) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
