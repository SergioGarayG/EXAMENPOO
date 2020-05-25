<<<<<<< HEAD

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> de24999c0ba1609490a29706c640d062f2ce89a9
package facturaexamen;

/**
 *
 * @author say
 */
<<<<<<< HEAD
public class LineaDetalle {
    private Integer CantidadComprada;
    private Integer SubTotalArticulo;
    private Integer InpuestoVenta;
    
    private articuloNuevo ArticuloNuevo;//INSTANCIA DE articuloNuevo
    private Articulo ARTICULO[]; //AGREGACION
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada
        CantidadComprada=0;
    }
    public void AgregarArticulo(Articulo oArticulo){
        CantidadComprada++;
        ARTICULO[CantidadComprada]= oArticulo;        
    }
     
    public void calcularImpuesto (){
        double Is=0.25;
        int a = (int) Is;
        this.InpuestoVenta=this.getCantidadComprada()*this.ArticuloNuevo.PrecioTotal()*a;
        //System.out.println("ISV: "+this.InpuestoVenta);
=======
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
>>>>>>> de24999c0ba1609490a29706c640d062f2ce89a9
    }

    public Integer getCantidadComprada() {
        return CantidadComprada;
    }

<<<<<<< HEAD
=======

>>>>>>> de24999c0ba1609490a29706c640d062f2ce89a9
    public void setCantidadComprada(Integer CantidadComprada) {
        this.CantidadComprada = CantidadComprada;
    }

<<<<<<< HEAD
    public Integer getInpuestoVenta() {
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    
    
}
=======
    
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










>>>>>>> de24999c0ba1609490a29706c640d062f2ce89a9
