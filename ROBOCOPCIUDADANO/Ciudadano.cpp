/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Ciudadano.cpp
 * Author: marle
 * 
 * Created on 26 de mayo de 2020, 02:27 AM
 */

#include "Ciudadano.h"

Ciudadano::Ciudadano() {
}

Ciudadano::Ciudadano(const Ciudadano& orig) {
}

Ciudadano::~Ciudadano() {
}
string Ciudadano::getID(){
    return ID;
}
void Ciudadano:: setID(string x){
    this->ID=x;
}
string Ciudadano::getNombre(){
    return Nombre;
}
void Ciudadano:: setNombre(string x){
    this->Nombre=x;
}

void Ciudadano :: Lanzar (){
    cout <<"EL CIUDADANO LANZA TURUNCAS"<<endl;
}
/*string Ciudadano::getLanzar(){
    return Lanzar;
}
void Robot:: setLanzar(string x){
    this->Lanzar=x;
}*/
