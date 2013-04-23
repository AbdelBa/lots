package main;
import covariance.chemistry.Atom;
import covariance.chemistry.Bond;
import covariance.chemistry.Molecule;
import covariance.informatics.Network;
import covariance.maths.Edge;
import covariance.maths.Graph;
import covariance.maths.Vertex;

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph("G");
        Molecule m = new Molecule("M");
        Network n = new Network("N");
        
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        g.addVertex(v1);
        g.addVertex(v2);
        
        
        Atom a1 = new Atom(3);
        Atom a2 = new Atom(4);
        m.addVertex(a1);
        m.addVertex(a2);
        
        Edge e = new Edge();
        Bond b = new Bond();
        
        g.addEdge(b, v1, v2);
        
        log(g);
        log(m);
        log(n);
    }

    private static void log(Object message)
    {
        System.out.println(message);
    }
}
