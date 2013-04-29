package generics.chemistry;

import generics.abs.AbsVertex;

public class GenAtom extends AbsVertex<GenMolecule, GenAtom, GenBound>
{
    public GenAtom(Integer label)
    {
        super(label);
    }
}
