/*
 * NotSameGraphException.cpp
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#include <iostream>
#include <exception>
using namespace std;

class NotSameGraphException: public exception
{
  virtual const char* what() const throw()
  {
    return "L'arete n'est pas dans le même graphe que les 2 sommets.";
  }
};
