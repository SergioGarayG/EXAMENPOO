/* 
 * File:   main.cpp
 * Author: marle
 *
 * Created on 26 de mayo de 2020, 02:08 AM
 */

#include <cstdlib>

using namespace std;

#include "Manifestante.h"
#include "Policia.h"
#include "Robot.h"
#include "Robocop.h"

Manifestante *MEU;
Policia *Chepo;
Robot *WallE;
Robocop *Terminator;
Ciudadano *C;
int main(int argc, char** argv) {
    //INSTANCIAS DE LAS CLASES
    MEU=new Manifestante();
    Chepo=new Policia();
    WallE=new Robot();
    Terminator=new Robocop();
    
    //DATOS MANIFESTANTE
    MEU->setID("0801199505876");
    MEU->setNombre("SAID SIERRA");
    MEU->setMotivo("LUCHA ESTUDIANTIL");
    MEU->Lanzar();
    
    //DATOS POLICIA
    Chepo->setID("0806198478435");
    Chepo->setNombre("FERRUFINO AGAPITO");
    Chepo->Lanzar();
    Chepo->setPlaca("SE21");
    
    //DATOS ROBOT
    WallE->setSerie("01");
    
    //DATOS ROBOCOP
    Terminator->setNombre("ARNOLD SWARZENEGER");
    Terminator->setID("5215SDE");
    Terminator->setPlaca("ILJ568");
    Terminator->setSerie("0101");
    //ROBOCOP PODRIA LANZAR DE POLICIA SI NO CREAMOS EL METODO LANZAR EN Robocop
    Terminator->Lanzar();
    
    cout << "\nEl Manifestante " <<MEU->getNombre() <<" con ID: "<<MEU->getID()<<endl;
    cout << "El Policia " <<Chepo->getNombre() <<" con ID: "<<Chepo->getID()<<endl;
    cout << "El ROBOCOP " <<Terminator->getNombre() <<" con ID: "<<Terminator->getID()<<" con Placa "<<Terminator->getPlaca()<<" con Serie "<<Terminator->getSerie()<<endl;
    cout << "El Robot con serie: " <<WallE->getSerie()<<endl;
    cout <<""<<endl;
    //USANDO POLIMORFISMO 
    //CIUDADANO: PADRE, ROBOCOP HIJO "NIETO"
    C=new Robocop();
    C->Lanzar();
    cout <<""<<endl;
    //POLICIA: PADRE, ROBOCOP HIJO
    Chepo=new Robocop();
    Chepo->Lanzar();
    cout <<""<<endl;
    return 0;
}
