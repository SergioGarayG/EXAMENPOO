/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Robocop.h
 * Author: marle
 *
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#ifndef ROBOCOP_H
#define ROBOCOP_H
#include "Policia.h"
#include "Robot.h"
class Robocop:public Policia, public Robot{
public:
    void Lanzar() override;
    Robocop();
    Robocop(const Robocop& orig);
    virtual ~Robocop();
private:

};

#endif /* ROBOCOP_H */

