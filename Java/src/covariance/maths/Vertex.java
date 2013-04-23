package covariance.maths;

import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class Vertex extends AbsVertex
{
    public Vertex(Integer label)
    {
        super(label);
    }

    public void setGraph(Graph g)
    {
        super.setGraph(g);        
    }
    
    @Override
    public void setGraph(AbsGraph g)
    {
        try
        {
            setGraph((Graph) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
