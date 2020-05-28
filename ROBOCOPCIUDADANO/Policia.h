

/* 
 * File:   Policia.h
 * Author: Sergio
 *
 * Created on 26 de mayo de 2020, 02:10 AM
 */

#ifndef POLICIA_H
#define POLICIA_H
#include "Ciudadano.h"
using namespace std;
class Policia :public Ciudadano {
public:
    void setPlaca(string);
    string getPlaca();
    void Lanzar() override;
    //void setLanzar(string);
    //string getLanzar();
    Policia();
    Policia(const Policia& orig);
    virtual ~Policia();
private:
    string Placa;
};

#endif /* POLICIA_H */

