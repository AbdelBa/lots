package generics.chemistry;

import generics.abs.AbsGraph;

public class GenMolecule extends AbsGraph<GenMolecule, GenAtom, GenBound>
{
    public GenMolecule(String name)
    {
        super("Molecule " + name);
    }
}
