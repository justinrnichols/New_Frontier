#include <iostream>
#ifndef PLAYER_H
#define PLAYER_H
using namespace std; 

class Player{ // define Player class
    public: // data members
        Player(); // call function Player (default constructor)
        Player(string); // call function Player with parameters string
        string getUsername(); // call function getUsername
        void setUsername(string); // call function setUsername with parameter string
    private: // member functions
        string userName; // define userName
};
#endif