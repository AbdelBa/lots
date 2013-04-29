package covariance.maths;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class CovVertex extends AbsVertex
{
    public CovVertex(Integer label)
    {
        super(label);
    }

    public void setGraph(CovGraph g)
    {
        super.setGraph(g);        
    }
    
    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((CovGraph) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
