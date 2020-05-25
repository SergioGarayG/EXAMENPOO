
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle {
    private Integer CantidadComprada;
    private Integer SubTotalArticulo;
    private Integer InpuestoVenta;
    private Integer MaxArticulos;
    private String ListaArticulo;
    
    private articuloNuevo ARTICULO[];//INSTANCIA DE articuloNuevo
    private articuloNuevo ArticuloNuevo; //AGREGACION
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada
        CantidadComprada=0;
        MaxArticulos=120;
        ARTICULO= new articuloNuevo[MaxArticulos];
    }
    /*public void AgregarArticulo(Articulo oArticulo){
        CantidadComprada++;
        ARTICULO[CantidadComprada]= oArticulo;        
    }*/
    public void AgregarArticulo(articuloNuevo oArticulo){
        CantidadComprada++;
        ARTICULO[CantidadComprada]= oArticulo; 
        
    }
    
    public String ListaArticulos(){          
        ListaArticulo="";
        System.out.println("LISTA DE ARTICULOS CADENA JSON");
        for(int i= 1; i <= CantidadComprada; i++){
            System.out.println("\"Articulo[]\": {\n"+"\"Nombre\""+": \""+ARTICULO[i].getNombre()+"\",\n"
            +"\"Codigo\": \""+ARTICULO[i].getCodigo()+"\",\n"+"\"Precio\": \""+ARTICULO[i].getPrecio()+"\n},");
        }      
        return ListaArticulo;  
        
    }
    
    /*public articuloNuevo[] ListaDeArticulos(){
        return ARTICULO;
    }*/
    public Integer getCantidadComprada() {   
        return CantidadComprada=+2;
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
    
    public void calcularImpuesto (){
        double Is=0.25;
        int a = (int) Is;
         
        
          // this.InpuestoVenta=this.getCantidadComprada()*this.ArticuloNuevo.getPrecio();
           //InpuestoVenta++;
        
        //this.InpuestoVenta=this.getCantidadComprada()*this.ArticuloNuevo.PrecioTotal();
        System.out.println("ISV: "+this.getInpuestoVenta());
    }
}
