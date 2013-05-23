/*
 * AbsGraph.cpp
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#include "AbsGraph.h"

template <class G, class V, class E>
AbsGraph<G, V, E>::AbsGraph(string name)
{
	this->name = "Generic " + name;
	this->vertice = new set<V*>();
	this->edges = new set<E*>();
}


template <class G, class V, class E>
virtual void AbsGraph<G, V, E>::addVertex(V* v)
{
	this->vertice->insert(v);
	v->setGraph(this);
}

template <class G, class V, class E>
virtual void AbsGraph<G, V, E>::removeVertex(V* v)
{
	this->vertice->erase(v);
	v->unbindGraph();
}

template <class G, class V, class E>
virtual void AbsGraph<G, V, E>::addEdge(E* e, V* v1, V* v2)
{
	e->bindVertice(v1, v2);
	this->edges->insert(e);
}

template <class G, class V, class E>
virtual void AbsGraph<G, V, E>::removeEdge(E* e)
{
	this->edges->erase(e);
	e->unbindGraph();
}

template <class G, class V, class E>
virtual set<E*>* AbsGraph<G, V, E>::getEdges()
{
	return this->edges;
}
