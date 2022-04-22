#include <iostream>
#include "Milestone.h" // include Milestone class
using namespace std;

Milestone::Milestone(){
    mile = 0; // redefine mile to equal 0
}

Milestone::Milestone(bool newType, string newName, int newMile, int newDepth){
    name = newName;
    type = newType;
    mile = newMile;
    depth = newDepth;
}

bool Milestone::getType(){
    return type; // return type
}

void Milestone::setType(bool newType){
    type = newType; // redefine type to equal newType
}

string Milestone::getName(){
    return name; // return name
}

void Milestone::setName(string newName){
    name = newName; // redefine name to equal newName
}

int Milestone::getMile(){
    return mile; // return mile
}

void Milestone::setMile(int newMile){
    mile = newMile; // redefine mile to equal newMile
}

int Milestone::getDepth(){
    return depth; // return depth
}

void Milestone::setDepth(int newDepth){
    depth = newDepth; // redefine depth to equal newDepth
}

int Milestone::split(string str, char c, string array[], int size){
    if(str.length() == 0){ // check if the length of str is equal to 0
        return 0; // return 0
    }
    string word = ""; // define word to be empty string
    int count = 0; // define count to equal 0
    str = str + c; // redefine str to equal str plus value of c
    for(int i = 0; i < str.length(); i++){ // use a for loop, setting i to 0 and i less than length of str, while incrementing i by 1
        if(str[i] == c){ // check if str at position i is equal to the value of c
            if(word.length() == 0) // check if the length of word is equal to 0
                continue; // if conditions are true, continue
            array[count++] = word; // redefine array at position count++ to equal word
            word = ""; // redefine word to be an empty string 
        } 
        else{ // for all other conditions
            word = word + str[i]; // redefine word to equal word plus str at position i
        }
    }
    return count; // return count
}