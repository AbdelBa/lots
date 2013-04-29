package main;

import generics.chemistry.GenAtom;
import generics.informatics.GenLink;
import generics.informatics.GenNetwork;
import generics.informatics.GenNode;
import covariance.chemistry.CovAtom;
import covariance.informatics.CovLink;
import covariance.informatics.CovNetwork;
import covariance.informatics.CovNode;

public class Main
{
    public static void main(String[] args)
    {
        covChimere();

        genChimere();
    }

    private static void genChimere()
    /*
     * Cr�e 2 r�seaux avec la m�thode g�n�ricit�. Le premier sera rempli
     * normalement (noeuds et liens) Dans le second on va tenter de mettre des
     * atomes.
     */
    {
        log("Test g�n�ricit�");
        GenNetwork net1 = new GenNetwork("N1");
        GenNetwork net2 = new GenNetwork("N2");

        // Remplissage normal du r�seau 1.
        GenNode n1 = new GenNode(1);
        GenNode n2 = new GenNode(2);
        net1.addVertex(n1);
        net1.addVertex(n2);

        GenLink e = new GenLink();

        net1.addEdge(e, n1, n2);

        // Remplissage anormal du r�seau n2
        GenAtom a1 = new GenAtom(3);
        // net2.addVertex(a1); -> Ne compile m�me pas, meilleur que la m�thode covariante.

        log(net1);
        log(net2);
        log('\n');
    }

    private static void covChimere()
    /*
     * Cr�e 2 r�seaux avec la m�thode covariante. Le premier sera rempli
     * normalement (noeuds et liens) Dans le second on va tenter de mettre des
     * atomes.
     */
    {
        log("Test covariance");
        CovNetwork net1 = new CovNetwork("N1");
        CovNetwork net2 = new CovNetwork("N2");

        // Remplissage normal du r�seau 1.
        CovNode n1 = new CovNode(1);
        CovNode n2 = new CovNode(2);
        net1.addVertex(n1);
        net1.addVertex(n2);

        CovLink e = new CovLink();

        net1.addEdge(e, n1, n2);

        // Remplissage anormal du r�seau n2
        CovAtom a1 = new CovAtom(3);
        net2.addVertex(a1);

        log(net1);
        log(net2);
        log('\n');
    }

    private static void log(Object message)
    {
        System.out.println(message);
    }
}
