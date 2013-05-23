/*
 * NoGraphException.cpp
 *
 *  Created on: 19 mai 2013
 *      Author: Abdelhamid
 */

#include <iostream>
#include <exception>
using namespace std;

class NoGraphException: public exception
{
  virtual const char* what() const throw()
  {
    return "Les 2 sommets ne sont pas dans le même graphe.";
  }
};
