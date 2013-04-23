package covariance.informatics;

import covariance.abs.AbsEdge;
import covariance.abs.AbsVertex;

public class Link extends AbsEdge
{
    public Link()
    {
    }
    
    public Link(AbsVertex n1, AbsVertex n2)
    {
        super(n1, n2);
    }
    
    public void bindVertice(Node v1, Node v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(AbsVertex a1, AbsVertex a2)
    {        
        try
        {
            bindVertice((Node) a1, (Node) a2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
