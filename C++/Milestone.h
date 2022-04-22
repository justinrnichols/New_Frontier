#include <iostream>
#ifndef MILESTONE_H
#define MILESTONE_H
using namespace std; 

class Milestone{ // define Milestone class
    public: // data members
        Milestone(); // call function Milestone (default constructor)
        Milestone(bool, string, int, int); // call function 
        bool getType(); // call function getType
        void setType(bool); // call function setType with parameters bool
        string getName(); // call function getName
        void setName(string); // call function setName with parameters string
        int getMile(); // call function getMile
        void setMile(int); // call function setMile with parameters int
        int getDepth(); // call function getDepth
        void setDepth(int); // call function setDepth with parameters int
        int split(string, char, string*, int); // call function split with parameters string, char, string array, int
    private: // member functions
        string name; // define name
        int mile; // define mile
        bool type; // define type
        int depth; // define depth
};
#endif