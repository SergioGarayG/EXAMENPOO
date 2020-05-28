/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Robot.cpp
 * Author: marle
 * 
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#include "Robot.h"

Robot::Robot() {
}

Robot::Robot(const Robot& orig) {
}

Robot::~Robot() {
}
string Robot::getSerie(){
    return Serie;
}
void Robot:: setSerie(string x){
    this->Serie=x;
}
