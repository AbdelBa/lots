package generics.abs;

import exceptions.NotSameGraphException;

@SuppressWarnings("rawtypes")
public abstract class AbsEdge<G extends AbsGraph, V extends AbsVertex, E extends AbsEdge>
{
    private V x;
    private V y;
    private G graph;

    public AbsEdge()
    {
    }

    public AbsEdge(V v1, V v2)
    {
        this.bindVertice(v1, v2);
    }

    public void unbindGraph()
    {
        this.graph = null;

        // On quitte le graphe, on ne r�f�rence donc plus les sommets x et
        // y.
        unbindVertice();
    }

    @SuppressWarnings("unchecked")
    public void bindVertice(V v1, V v2)
    {
        try
        {
            if (!(v1.getGraph() == v2.getGraph()) || v1.getGraph() == null
                    || v2.getGraph() == null)
                throw new NotSameGraphException(
                        "Les 2 sommets ne sont pas dans le m�me graphe.");

            if (!(graph == v1.getGraph()) && graph != null)
                throw new NotSameGraphException(
                        "L'arete n'est pas dans le m�me graphe que les 2 sommets.");

            if (graph == null)
            {
                graph = (G) v1.getGraph();
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
