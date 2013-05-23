/*
 * AbsGraph.h
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#ifndef ABSGRAPH_H_
#define ABSGRAPH_H_

#include <string>
#include <set>
using namespace std;

template <class G, class V, class E>

class AbsGraph {
public:
	AbsGraph();
	AbsGraph(string name);
	virtual ~AbsGraph();

	virtual void addVertex(V* v);
	virtual void removeVertex(V* v);
	virtual void addEdge(E* e, V* v1, V* v2);
	virtual void removeEdge(E* e);
	virtual set<E*>* getEdges();

private:
	string name;
	set<V*> vertice;
	set<E*> edges;
};

#endif /* ABSGRAPH_H_ */
