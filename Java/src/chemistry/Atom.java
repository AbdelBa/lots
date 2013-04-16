package chemistry;

import maths.Graph;
import maths.Vertex;

public class Atom extends Vertex
{
    public Atom(Integer label)
    {
        super(label);
    }

    public void setGraph(Molecule m)
    {
        super.setGraph(m);
    }

    @Override
    public void setGraph(Graph g)
    {
        try
        {
            setGraph((Molecule) g);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
