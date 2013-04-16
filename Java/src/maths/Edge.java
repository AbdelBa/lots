package maths;

import exceptions.NotSameGraphException;

/*
 * Invariants - x et y sont nuls tout les deux - x et y sont non nuls tout les
 * deux - x, y et this sont dans le mÔøΩme graphe
 */
public class Edge
{
    private Vertex x;
    private Vertex y;
    private Graph graph;

    public Edge()
    {
    }

    public Edge(Vertex v1, Vertex v2)
    {
        this.bindVertice(v1, v2);
    }

    public void unbindGraph()
    {
        this.graph = null;

        // On quitte le graphe, on ne référence donc plus les sommets x et
        // y.
        unbindVertice();
    }

    public void bindVertice(Vertex v1, Vertex v2)
    {
        try
        {
            if (!(v1.getGraph() == v2.getGraph()) || v1.getGraph() == null
                    || v2.getGraph() == null)
                throw new NotSameGraphException(
                        "Les 2 sommets ne sont pas dans le même graphe.");

            if (!(graph == v1.getGraph()) && graph != null)
                throw new NotSameGraphException(
                        "L'arete n'est pas dans le même graphe que les 2 sommets.");

            if (graph == null)
            {
                graph = v1.getGraph();
                graph.getEdges().add(this);
            }

            this.x = v1;
            this.y = v2;

            v1.getIncidentEdges().add(this);
            v2.getIncidentEdges().add(this);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void unbindVertice()
    {
        x.getIncidentEdges().remove(this);
        x = null;

        y.getIncidentEdges().remove(this);
        y = null;
    }

    public String toString()
    {
        return String.format("(%s, %s)", x, y);
    }
}
