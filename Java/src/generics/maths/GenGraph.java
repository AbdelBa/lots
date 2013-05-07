package generics.maths;

import generics.abs.AbsGraph;

public class GenGraph extends AbsGraph<GenGraph, GenVertex, GenEdge>
{
    public GenGraph(String name)
    {
        super("Graph " + name);
    }
}
