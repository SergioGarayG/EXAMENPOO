/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Manifestante.h
 * Author: marle
 *
 * Created on 26 de mayo de 2020, 02:09 AM
 */

#ifndef MANIFESTANTE_H
#define MANIFESTANTE_H
#include "Ciudadano.h"
using namespace std;
class Manifestante:public Ciudadano {
public:
    void setMotivo(string);
    string getMotivo();
    void Lanzar() override;
    /*void setLanzar(string);
    string getLanzar();*/
    Manifestante();
    Manifestante(const Manifestante& orig);
    virtual ~Manifestante();
private:
    string Motivo;
};

#endif /* MANIFESTANTE_H */

