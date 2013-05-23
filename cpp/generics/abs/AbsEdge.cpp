/*
 * AbsEdge.cpp
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#include <iostream>
#include <exception>
using namespace std;

#include "AbsEdge.h"
#include "../../exceptions/NotSameGraphException.cpp"

template <class G, class V, class E>

AbsEdge<G, V, E>::AbsEdge()
{x = 0; y=0; graph=0;}

template <class G, class V, class E>
AbsEdge<G, V, E>::AbsEdge(V* v1, V* v2)
{
	x = 0; y=0; graph=0;
	this->bindVertice(v1, v2);
}

template <class G, class V, class E>
virtual void AbsEdge<G, V, E>::unbindGraph()
{
	this->graph = 0;
	this->unbindVertice();
}

template <class G, class V, class E>
virtual void AbsEdge<G, V, E>::bindVertice(V* v1, V* v2)
{
	try
	{
		if (!(v1->getGraph() == v2->getGraph()) || v1->getGraph() == 0 || v2->getGraph() == 0)
			throw new NotSameGraphException();

		if (!(this->graph == v1->getGraph()) && this->graph != 0)
			throw new NotSameGraphException();

		if (this->graph == 0)
		{
			this->graph = v1->getGraph();
			this->graph->getEdges()->add(this);
		}

		this->x = v1;
		this->y = v2;

		v1->getIncidentEdges()->add(this);
		v2->getIncidentEdges()->add(this);
	}
	catch (exception& e)
	{
		cout << e.what() << endl;
	}
}

template <class G, class V, class E>
virtual void AbsEdge<G, V, E>::unbindVertice()
{
	x->getIncidentEdges->remove(this);
	x = 0;

	y->getIncidentEgdes->remove(this);
	y = 0;
}
