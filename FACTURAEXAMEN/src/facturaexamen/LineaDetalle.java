
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle {
    private Integer CantidadComprada;
    private double SubTotalArticulo=0;
    private double InpuestoVenta;
    private Integer MaxArticulos;
    private String ListaArticulo;
    
    private articuloNuevo ARTICULO[];//INSTANCIA DE articuloNuevo
    //private articuloNuevo ArticuloNuevo; //AGREGACION
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada        
        CantidadComprada=-1;
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
        for(int i= 0; i <= CantidadComprada; i++){
            System.out.println("\"Articulo[]\": {\n"+"\"Nombre\""+": \""+ARTICULO[i].getNombre()+"\",\n"
            +"\"Codigo\": \""+ARTICULO[i].getCodigo()+"\",\n"+"\"Precio\": \""+ARTICULO[i].getPrecio()+"\n},");
        }   
        return ListaArticulo;        
    }
    
    /*public articuloNuevo[] ListaDeArticulos(){
        return ARTICULO;
    }*/
    public Integer getCantidadComprada() { 
        return CantidadComprada+1;
    }

    public void setCantidadComprada(Integer CantidadComprada) {
        this.CantidadComprada = CantidadComprada;
        
    }
    public double getInpuestoVenta() {
        double Is=0.25;
        this.InpuestoVenta=this.getSubTotalArticulo()*Is;
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    public void ST(){
        for (int i = 0; i<= CantidadComprada; i++) {
            SubTotalArticulo+=ARTICULO[i].getPrecio();
            System.out.println(ARTICULO[i].getPrecio());
        }
    }
    public double getSubTotalArticulo() {       
        //ArticuloNuevo=new articuloNuevo();
        
        return SubTotalArticulo;
    }

    public void setSubTotalArticulo(Integer SubTotalArticulo) {
        this.SubTotalArticulo = SubTotalArticulo;
    }
    
    public void calcularImpuesto (){       
        System.out.println("ISV: "+this.getInpuestoVenta());
    }
    
}
