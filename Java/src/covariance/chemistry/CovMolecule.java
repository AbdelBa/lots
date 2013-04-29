package covariance.chemistry;

import covariance.abs.AbsEdge;
import covariance.abs.AbsGraph;
import covariance.abs.AbsVertex;

public class CovMolecule extends AbsGraph
{
    public CovMolecule(String name)
    {
        super("Molecule " + name);
    }
    
    public void addVertex(CovAtom a)
    {
        super.addVertex(a);
    }
    
    public void addEdge(CovBond b, CovAtom a1, CovAtom a2)
    {
        super.addEdge(b, a1, a2);
    }
    
    @Override
    public void addVertex(AbsVertex v)
    {
        try
        {
            addVertex((CovAtom) v);
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
            addEdge((CovBond) a, (CovAtom) v1, (CovAtom) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
