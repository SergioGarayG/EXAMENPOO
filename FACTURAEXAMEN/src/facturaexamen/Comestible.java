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
public class Comestible extends articuloNuevo implements Articulo{
    private String FechaVencimiento;
    
    @Override
    public void SolicitarAbastecimiento() {
        System.out.println("ABASTECIMIENTO SOLICITADO PARA COMESTIBLES");
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    
    
}
