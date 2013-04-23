package generics.math;

import covariance.abs.AbsVertex;

public class Vertex<T extends Graph> extends AbsVertex
{
    private T graph;
    
    public Vertex(Integer label)
    {
        super(label);
    }

}
