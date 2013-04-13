package chemistry;

import maths.Edge;
import maths.Vertex;

public class Bond extends Edge
{
    public Bond(Atom a1, Atom a2)
    {
        super(a1, a2);
    }

    @Override
    public void bindVertice(Vertex v1, Vertex v2)
    {
        super.bindVertice(v1, v2);
    }
    
    public void bindVertice(Atom a1, Atom a2)
    {        
        try
        {
            bindVertice((Atom) a1, (Atom) a2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
