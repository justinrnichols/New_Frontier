#include <iostream>
#include "Supplies.h" // include Supplies class
using namespace std;

Supplies::Supplies(){
    money = 0; // redefine money to equal 1200
    ox = 0; // redefine ox to equal 0
    food = 0; // redefine food to equal 0
    bullets = 0; // redefine bullets to equal 0
    wagonParts = 0; // redefine wagonParts to equal 0
    medKit = 0; // redefine medKit to equal 0
}

Supplies::Supplies(double newMoney, int newOx, int newFood, int newBullets, int newWagonParts, int newMedKit){
    money = newMoney; // redefine money to equal newMoney
    ox = newOx; // redefine ox to equal newOx
    food = newFood; // redefine food to equal newFood
    bullets = newBullets; // redefine bullets to equal newBullets
    wagonParts = newWagonParts; // redefine wagonParts to equal newWagonParts
    medKit = newMedKit; // redefine medKit to equal newMedKit
}

double Supplies::getMoney(){
    return money; // return money
}

void Supplies::setMoney(double newMoney){
    money = newMoney; // redefine money to equal newMoney
}

int Supplies::getOx(){
    return ox; // return ox
}

void Supplies::setOx(int newOx){
    ox = newOx; // redefine ox to equal newOx
}

int Supplies::getFood(){
    return food; // return food
}

void Supplies::setFood(int newFood){
    food = newFood; // redefine food to equal newFood
}

int Supplies::getBullets(){
    return bullets; // return bullets
}

void Supplies::setBullets(int newBullets){
    bullets = newBullets; // redefine bullets to equal newBullets
}

int Supplies::getWagonParts(){
    return wagonParts; // return wagonParts
}

void Supplies::setWagonParts(int newWagonParts){
    wagonParts = newWagonParts; // redefine wagonParts to equal newWagonParts
}

int Supplies::getMedKit(){
    return medKit; // return medKit
}

void Supplies::setMedKit(int newMedKit){
    medKit = newMedKit; // redefine medKit to equal newMedKit
}