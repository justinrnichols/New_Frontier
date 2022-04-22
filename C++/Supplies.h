#include <iostream>
#ifndef SUPPLIES_H
#define SUPPLIES_H
using namespace std; 

class Supplies{ // define Supplies class
    public: // data members
        Supplies(); // call function Supplies (default constructor)
        Supplies(double, int, int, int, int, int); // call function Date with parameters double, int, int, int, int, int
        double getMoney(); // call function getMoney
        void setMoney(double); // call function setMoney with parameter double
        int getOx(); // call function getOx
        void setOx(int); // call function setOx with parameter int
        int getFood(); // call function getFood
        void setFood(int); // call function setFood with parameter int
        int getBullets(); // call function getBullets
        void setBullets(int); // call function setBullets with parameter int
        int getWagonParts(); // call function getWagonParts
        void setWagonParts(int); // call function setWagonParts with parameter int
        int getMedKit(); // call function getMedKit
        void setMedKit(int); // call function setMedKit with parameter int
    private: // member functions
        double money; // define money
        int ox; // define ox
        int food; // define food
        int bullets; // define bullets
        int wagonParts; // define wagonParts
        int medKit; // define medKit
};
#endif