/*
 * AbsVertex.h
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#ifndef ABSVERTEX_H_
#define ABSVERTEX_H_

#include <set>
using namespace std;

template <class G, class V, class E>

class AbsVertex {
public:
	AbsVertex(int label);
	virtual ~AbsVertex();

	virtual void unbindGraph();
	virtual G* getGraph();
	virtual void setGraph(G*);
	virtual set<E*>* getIncidentEdges();

private:
	int label;
	set<E*> incidentEdges();
	G* graph;
};

#endif /* ABSVERTEX_H_ */
