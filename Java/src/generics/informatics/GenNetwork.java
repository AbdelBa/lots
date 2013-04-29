package generics.informatics;

import generics.abs.AbsGraph;

public class GenNetwork extends AbsGraph<GenNetwork, GenNode, GenLink>
{

    public GenNetwork(String name)
    {
        super("Network " + name);
    }

}
