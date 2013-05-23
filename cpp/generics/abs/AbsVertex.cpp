/*
 * AbsVertex.cpp
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#include "AbsVertex.h"

template <class G, class V, class E>
AbsVertex<G, V, E>::AbsVertex(int label)
{
	this->label = label;
	this->incidentEdges = new set<E*>();
	this->graph = 0;
}

template <class G, class V, class E>
virtual void AbsVertex<G, V, E>::unbindGraph()
{
	set<E*>::iterator it;
	for(it=incidentEdges->begin();
		it!=incidentEdges->end();
		it++)
		this->graph->removeEdge(it.)


	std::for_each(incidentEdges->begin(), incidentEdges->end(), )
}
