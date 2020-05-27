/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Policia.cpp
 * Author: marle
 * 
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#include "Policia.h"

Policia::Policia() {
}

Policia::Policia(const Policia& orig) {
}

Policia::~Policia() {
}
string Policia::getPlaca(){
    return Placa;
}
void Policia:: setPlaca(string x){
    this->Placa=x;
}
void Policia :: Lanzar (){
    cout <<"EL POLICIA  LANZA BOMBAS LAGRIMOGENAS"<<endl;
}

