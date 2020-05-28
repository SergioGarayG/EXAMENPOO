/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaexamen;

/**
 *
 * @author say
 */
public class Ferreteria extends Articulo // implements Articulo
{

    private String Area;
    
    public void SolicitarAbastecimiento() {
        System.out.println("ABASTECIMIENTO SOLICITADO PARA FERRETERIA");      
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    public void EligaArea(String oArea){
        
    }
}
