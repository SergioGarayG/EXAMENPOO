/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Robocop.cpp
 * Author: marle
 * 
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#include "Robocop.h"

Robocop::Robocop() {
}

Robocop::Robocop(const Robocop& orig) {
}

Robocop::~Robocop() {
}
//HICE ESTE METODO ACA PARA QUE ROBOCOP LANCE INDIVIDUALMENTE
//ESTE PODRIA LANZAR LO DE POLICIA SIN CREAR ESTE METODO PERO COMO HAY HERENCIA
//SE PUEDE USAR POLIMORFISMO
void Robocop :: Lanzar (){
    cout <<"EL ROBOCOP LANZA BOMBAS DE GAS"<<endl;
}
