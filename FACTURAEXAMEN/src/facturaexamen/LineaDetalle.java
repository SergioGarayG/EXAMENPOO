
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle {
    private Integer CantidadComprada;
    private Integer SubTotalArticulo;
    private double InpuestoVenta;
    private Integer MaxArticulos;
    private String ListaArticulo;
    
    private articuloNuevo ARTICULO[];//INSTANCIA DE articuloNuevo
    private articuloNuevo ArticuloNuevo; //AGREGACION
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada        
        CantidadComprada=0;
        MaxArticulos=12;
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
    public double getInpuestoVenta() {
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    
    public void calcularImpuesto (){
        double Is=0.25;   
        //Integer a = (int) Is;
        
        for (int i = 0; i <ARTICULO.length; i++) {
           this.InpuestoVenta=ARTICULO[i].Precio*this.getCantidadComprada()*Is;            
        }
        
        System.out.println("ISV: "+this.ArticuloNuevo.getPrecio());
    }
}
