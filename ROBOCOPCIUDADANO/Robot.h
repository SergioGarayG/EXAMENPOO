/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Robot.h
 * Author: marle
 *
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#ifndef ROBOT_H
#define ROBOT_H
#include <string>
using namespace std;
class Robot {
public:
    void setSerie(string);
    string getSerie();
    Robot();
    Robot(const Robot& orig);
    virtual ~Robot();
private:
    string Serie;
};

#endif /* ROBOT_H */

