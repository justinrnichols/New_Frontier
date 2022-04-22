#include <iostream>
#ifndef STATUS_H
#define STATUS_H
using namespace std; 

class Status{ // define Status class
    public: // data members
        Status(); // call function Status (default constructor)
        double setMoneyStatus(double); // call function setMoneyStatus with parameter double
        int setOxStatus(int); // call function setOxStatus with parameter int
        int setFoodStatus(int); // call function setFoodStatus with parameter int
        int setBulletsStatus(int); // call function setBulletsStatus with parameter int
        int setWagonPartsStatus(int); // call function setWagonPartsStatus with parameter int
        int setMedKitStatus(int); // call function setMedKitStatus with parameter int
        int setMilestone(int); // call function setMilestone with parameter int
    private: // member functions
        double money; // define money
        int ox; // define ox
        int food; // define food
        int bullets; // define bullets
        int wagonParts; // define wagonParts
        int medKit; // define medKit
        int mile; // define mile
};
#endif