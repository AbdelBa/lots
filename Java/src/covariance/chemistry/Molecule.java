package covariance.chemistry;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class Molecule extends AbsGraph
{
    public Molecule(String name)
    {
        super(name);
    }
    
    public void addVertex(Atom a)
    {
        super.addVertex(a);
    }
    
    public void addEdge(Bond b, Atom a1, Atom a2)
    {
        super.addEdge(b, a1, a2);
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((Atom) v);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void addEdge(AbsEdge a, AbsVertex v1, AbsVertex v2)
    {
        try
        {
            addEdge((Bond) a, (Atom) v1, (Atom) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
