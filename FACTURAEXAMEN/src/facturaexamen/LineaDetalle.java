
package facturaexamen;

/**
 *
 * @author say
 */
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
    }

    public Integer getCantidadComprada() {
        return CantidadComprada;
    }

    public void setCantidadComprada(Integer CantidadComprada) {
        this.CantidadComprada = CantidadComprada;
    }

    public Integer getInpuestoVenta() {
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    
    
}
