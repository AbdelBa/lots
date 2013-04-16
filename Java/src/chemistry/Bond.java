package chemistry;

import maths.Edge;
import maths.Vertex;

public class Bond extends Edge
{
    public Bond(Vertex v1, Vertex v2)
    {
        super(v1, v2);
    }

    public Bond()
    {
    }

    public void bindVertice(Atom v1, Atom v2)
    {
        super.bindVertice(v1, v2);
    }
    
    @Override
    public void bindVertice(Vertex a1, Vertex a2)
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
