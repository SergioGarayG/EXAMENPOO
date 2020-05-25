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
public class LineaDetalle{
    private Integer CantidadComprada;
    private Integer SubTotalArticulo;
    private Integer InpuestoVenta;
   // private Integer ContaArticulo;
    private ArticuloNuevo Articulo;
  
    
<<<<<<< HEAD:FACTURAEXAMEN/src/facturaexamen/LineaDetalle.java
     private Articulo ARTICULO[]; 

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }

    public Integer getInpuestoVenta() {
        return InpuestoVenta;
    }

    public Integer getCantidadComprada() {
        return CantidadComprada;
    }


    public void setCantidadComprada(Integer CantidadComprada) {
        this.CantidadComprada = CantidadComprada;
    }

    
      public void AgregarArticulo  (Articulo oArticulo){
  
      CantidadComprada++;
      ARTICULO[CantidadComprada]=oArticulo;
              
     }

    public LineaDetalle() {
        CantidadComprada =0;
    }
      
=======
    private Articulo ARTICULO[]; 
    
    
>>>>>>> master:FACTURAEXAMEN/src/facturaexamen/LineaDealle.java
    public void calcularImpuesto (){
        
        double Is= 0.25;
        int a = (int) Is;
       this.InpuestoVenta=this.getCantidadComprada()*this.Articulo. PrecioTotal()*a;
        System.out.println("ISV: " +this.InpuestoVenta ) ;
  
        return;
 
    }
    
   
}










