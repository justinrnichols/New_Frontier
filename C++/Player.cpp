#include <iostream>
#include "Player.h" // include Player class
using namespace std;

Player::Player(){
    userName = ""; // redefine userName to equal an empty string
}

Player::Player(string newUsername){
    userName = newUsername; // redefine userName to equal newUsername
}

string Player::getUsername(){
    return userName; // return userName
}

void Player::setUsername(string newUsername){
    userName = newUsername; // redefine userName to equal newUsername
}