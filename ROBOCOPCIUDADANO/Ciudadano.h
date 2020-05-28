/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Ciudadano.h
 * Author: marle
 *
 * Created on 26 de mayo de 2020, 02:27 AM
 */

#ifndef CIUDADANO_H
#define CIUDADANO_H
#include <string>
#include <iostream>
using namespace std;
class Ciudadano {
public:
    void setID(string);
    string getID();
    void setNombre(string);
    string getNombre();
    virtual void Lanzar(void)=0;
    /*virtual void setLanzar(string);
    virtual string getLanzar();*/
    Ciudadano();
    Ciudadano(const Ciudadano& orig);
    virtual ~Ciudadano();
private:
    string ID;
    string Nombre;
    //string Lanzar;
};

#endif /* CIUDADANO_H */

