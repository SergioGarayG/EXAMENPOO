/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Manifestante.cpp
 * Author: marle
 * 
 * Created on 26 de mayo de 2020, 02:09 AM
 */

#include "Manifestante.h"

Manifestante::Manifestante() {
}

Manifestante::Manifestante(const Manifestante& orig) {
}

Manifestante::~Manifestante() {
}
string Manifestante::getMotivo(){
    return Motivo;
}
void Manifestante:: setMotivo(string x){
    this->Motivo=x;
}
void Manifestante :: Lanzar (){
    cout <<"EL MANIFESTANTE LANZA PALOS"<<endl;
}

