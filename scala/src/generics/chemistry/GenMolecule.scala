package generics.chemistry

import generics.abs.AbsGraph


class GenMolecule(name:String) extends AbsGraph[GenMolecule,GenAtom,GenBound]("Molecule " + name) {
}
