import maths.Edge;
import maths.Graph;
import maths.Vertex;
import chemistry.Atom;
import chemistry.Molecule;


public class Main
{
    public static void main(String[] args)
    {
        Graph g = genGraph("G1");
        
        System.out.println(g);
    }

    private static Graph genGraph(String name)
    {
        Graph g = new Graph(name);
        
        Vertex v1 = new Vertex('a');
        Vertex v2 = new Vertex('b');
        Vertex v3 = new Vertex('c');
        Vertex v4 = new Vertex('d');
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        
        // Les arêtes sont ajoutées automatiquement.
        new Edge(v1, v2);
        new Edge(v1, v3);
        new Edge(v2, v4);
        
        return g;
    }
}
