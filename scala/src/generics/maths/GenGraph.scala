package generics.maths

import generics.abs.AbsGraph


class GenGraph(name:String) extends AbsGraph[GenGraph,GenVertex,GenEdge]("Graph " + name) {
}
