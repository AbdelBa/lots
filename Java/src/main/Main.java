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
     * Crée 2 réseaux avec la méthode généricité. Le premier sera rempli
     * normalement (noeuds et liens) Dans le second on va tenter de mettre des
     * atomes.
     */
    {
        log("Test généricité");
        GenNetwork net1 = new GenNetwork("N1");
        GenNetwork net2 = new GenNetwork("N2");

        // Remplissage normal du réseau 1.
        GenNode n1 = new GenNode(1);
        GenNode n2 = new GenNode(2);
        net1.addVertex(n1);
        net1.addVertex(n2);

        GenLink e = new GenLink();

        net1.addEdge(e, n1, n2);

        // Remplissage anormal du réseau n2
        GenAtom a1 = new GenAtom(3);
        // net2.addVertex(a1); -> Ne compile même pas, meilleur que la méthode covariante.

        log(net1);
        log(net2);
        log('\n');
    }

    private static void covChimere()
    /*
     * Crée 2 réseaux avec la méthode covariante. Le premier sera rempli
     * normalement (noeuds et liens) Dans le second on va tenter de mettre des
     * atomes.
     */
    {
        log("Test covariance");
        CovNetwork net1 = new CovNetwork("N1");
        CovNetwork net2 = new CovNetwork("N2");

        // Remplissage normal du réseau 1.
        CovNode n1 = new CovNode(1);
        CovNode n2 = new CovNode(2);
        net1.addVertex(n1);
        net1.addVertex(n2);

        CovLink e = new CovLink();

        net1.addEdge(e, n1, n2);

        // Remplissage anormal du réseau n2
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
