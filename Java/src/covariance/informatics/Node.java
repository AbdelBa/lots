package covariance.informatics;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class Node extends AbsVertex
{
    public Node(Integer label)
    {
        super(label);
    }
    
    public void setGraph(Network g)
    {
        super.setGraph(g);        
    }
    
    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((Network) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
