package main

import generics.chemistry.GenAtom
import generics.informatics.GenLink
import generics.informatics.GenNetwork
import generics.informatics.GenNode
import covariance.chemistry.CovAtom
import covariance.informatics.CovLink
import covariance.informatics.CovNetwork
import covariance.informatics.CovNode

object Main {
  def main(args: Array[String]): Unit = {
    covChimere()
    genChimere()
  }

  private def genChimere(): Unit = {
    log("Test généricité")
    var net1: GenNetwork = new GenNetwork("N1")
    var net2: GenNetwork = new GenNetwork("N2")
    var n1: GenNode = new GenNode(1)
    var n2: GenNode = new GenNode(2)
    net1.addVertex(n1)
    net1.addVertex(n2)
    var e: GenLink = new GenLink()
    net1.addEdge(e, n1, n2)
    var a1: GenAtom = new GenAtom(3)
    log(net1)
    log(net2)
    log("\n")
  }

  private def covChimere(): Unit = {
    log("Test covariance")
    var net1: CovNetwork = new CovNetwork("N1")
    var net2: CovNetwork = new CovNetwork("N2")
    var n1: CovNode = new CovNode(1)
    var n2: CovNode = new CovNode(2)
    net1.addVertex(n1)
    net1.addVertex(n2)
    var e: CovLink = new CovLink()
    net1.addEdge(e, n1, n2)
    var a1: CovAtom = new CovAtom(3)
    net2.addVertex(a1)
    log(net1)
    log(net2)
    log("\n")
  }

  private def log(message: Object): Unit = {
    System.out.println(message)
  }

}
