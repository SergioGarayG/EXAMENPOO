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
    WallE->setSerie("0801199505876");
    
    //DATOS ROBOCOP
    Terminator->setNombre("ARNOLD SWARZENEGER");
    Terminator->setID("5215SDE");
    Terminator->Lanzar();
    Terminator->setPlaca("ILJ568");
    
    cout << "El Manifestante " <<MEU->getNombre() <<" con ID: "<<MEU->getID()<<" lanzo "<<endl;
    cout << "El Policia " <<Chepo->getNombre() <<" con ID: "<<Chepo->getID()<<" lanzo "<<endl;
    cout << "El ROBOCOP " <<Terminator->getNombre() <<" con ID: "<<Terminator->getID()<<" con Placa "<<Terminator->getPlaca()<<endl;
  

    
    return 0;
}
