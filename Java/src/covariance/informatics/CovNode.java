package covariance.informatics;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class CovNode extends AbsVertex
{
    public CovNode(Integer label)
    {
        super(label);
    }
    
    public void setGraph(CovNetwork g)
    {
        super.setGraph(g);        
    }
    
    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((CovNetwork) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
