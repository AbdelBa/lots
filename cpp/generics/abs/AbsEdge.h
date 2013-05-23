/*
 * AbsEdge.h
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#ifndef ABSEDGE_H_
#define ABSEDGE_H_

template <class G, class V, class E>

class AbsEdge {
public:
	AbsEdge();
	AbsEdge(V* v1, V* v2);
	virtual ~AbsEdge();

	virtual void unbindGraph();
	virtual void bindVertice(V* v1, V* v2);
	virtual void unbindVertice();

private:
	V* x;
	V* y;
	G* graph;
};

#endif /* ABSEDGE_H_ */
