package generics.informatics;

import generics.abs.AbsVertex;

public class GenNode extends AbsVertex<GenNetwork, GenNode, GenLink>
{
    public GenNode(Integer label)
    {
        super(label);
    }
}
