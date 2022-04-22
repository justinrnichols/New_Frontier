#include <iostream>
#include "Status.h" // include Status class
using namespace std;

Status::Status(){
    money = 0; // redefine money to equal 0
    ox = 0; // redefine ox to equal 0
    food = 0; // redefine food to equal 0
    bullets = 0; // redefine bullets to equal 0
    wagonParts = 0; // redefine wagonParts to equal 0
    medKit = 0; // redefine medKit to equal 0
    mile = 0; // redefine mile to equal 0
}

double Status::setMoneyStatus(double money){
    if(money == 1) // check if money is equal to 1
        cout << "You currently have " << money << " dollar." << endl; // output message
    if(money == 0 || money > 1) // check if money is equal to 0 OR if money is greater than 1
        cout << "You currently have " << money << " dollars." << endl; // output message
    return money; // return money
}

int Status::setOxStatus(int ox){
    if(ox == 1) // check if ox is equal to 1
        cout << "You currently have " << ox << " ox." << endl; // output message
    if(ox == 0 || ox > 1) // check if ox is equal to 0 OR if ox is greater than 1
        cout << "You currently have " << ox << " oxen." << endl; // output message
    return ox; // return ox
}

int Status::setFoodStatus(int food){
    if(food == 1) // check if food is equal to 1
        cout << "You currently have " << food << " pound of food." << endl; // output message
    if(food == 0 || food > 1) // check if food is equal to 0 OR if food is greater than 1
        cout << "You currently have " << food << " pounds of food." << endl; // output message
    return food; // return food
}

int Status::setBulletsStatus(int bullets){
    if(bullets == 1) // check if bullets is equal to 1
        cout << "You currently have " << bullets << " bullet." << endl; // output message
    if(bullets == 0 || bullets > 1) // check if bullets is equal to 0 OR if bullets is greater than 1
        cout << "You currently have " << bullets << " bullets." << endl; // output message
    return bullets; // return bullets
}

int Status::setWagonPartsStatus(int wagonParts){
    if(wagonParts == 1) // check if wagonParts is equal to 1
        cout << "You currently have " << wagonParts << " wagon part." << endl; // output message
    if(wagonParts == 0 || wagonParts > 1) // check if wagonParts is equal to 0 OR if wagonParts is greater than 1
        cout << "You currently have " << wagonParts << " wagon parts." << endl; // output message
    return wagonParts; // return wagonParts
}

int Status::setMedKitStatus(int medKit){
    if(medKit == 1) // check if medKit is equal to 1
        cout << "You currently have " << medKit << " medical aid kit." << endl; // output message
    if(medKit == 0 || medKit > 1) // check if medKit is equal to 0 OR if medKit is greater than 1
        cout << "You currently have " << medKit << " medical aid kits." << endl; // output message
    return medKit; // return medKit
}

int Status::setMilestone(int mile){
    if(mile < 102 && mile >= 0) // check if mile is less than 102 AND if mile is greater than or equal to 0
         cout << endl << "You have " << 102 - mile << " miles until the next river milestone (Kansas River Crossing)." << endl; // output message
    if(mile < 185 && mile > 102) // check if mile is less than 185 AND if mile is greater than 102
        cout << endl << "You have " << 185 - mile << " miles until the next river milestone (Big Blue River Crossing)." << endl; // output message
    if(mile < 304 && mile > 185) // check if mile is less than 304 AND if mile is greater than 185
        cout << endl << "You have " << 304 - mile << " miles until the next fort milestone (Fort Kearney)." << endl; // output message
    if(mile < 640 && mile > 304) // check if mile is less than 640 AND if mile is greater than 304
        cout << endl << "You have " << 640 - mile << " miles until the next fort milestone (Fort Laramie)." << endl; // output message
    if(mile < 989 && mile > 640) // check if mile is less than 989 AND if mile is greater than 640
        cout << endl << "You have " << 989 - mile << " miles until the next fort milestone (Fort Bridger)." << endl; // output message
    if(mile < 1151 && mile > 989) // check if mile is less than 1151 AND if mile is greater than 989
        cout << endl << "You have " << 1151 - mile << " miles until the next river milestone (Green River Crossing)." << endl; // output message
    if(mile < 1395 && mile > 1151) // check if mile is less than 1395 AND if mile is greater than 1151
        cout << endl << "You have " << 1395 - mile << " miles until the next fort milestone (Fort Hall)." << endl; // output message
    if(mile < 1534 && mile > 1395) // check if mile is less than 1534 AND if mile is greater than 1395
        cout << endl << "You have " << 1534 - mile << " miles until the next river milestone (Snake River Crossing)." << endl; // output message
    if(mile < 1648 && mile > 1534) // check if mile is less than 1648 AND if mile is greater than 1534
        cout << endl << "You have " << 1648 - mile << " miles until the next fort milestone (Fort Boise)." << endl; // output message
    if(mile < 1863 && mile > 1648) // check if mile is less than 1863 AND if mile is greater than 1648
        cout << endl << "You have " << 1863 - mile << " miles until the next fort milestone (Fort Walla Walla)." << endl; // output message
    if(mile < 2040 && mile > 1863) // check if mile is less than 2040 AND if mile is greater than 1863
        cout << endl << "You have " << 1863 - mile << " miles until the next fort milestone (Fort Walla Walla)." << endl; // output message
    return mile; // return mile;
}