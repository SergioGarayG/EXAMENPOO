
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle {
    private Integer CantidadComprada;
    private double SubTotalArticulo;
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
    int i=0;
    public void AgregarArticulo(articuloNuevo oArticulo){
        CantidadComprada++;
        ARTICULO[CantidadComprada]= oArticulo; 
        System.out.println("articulo agregado");
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
    double Is=0.25;
    public double getSubTotalArticulo() {
        ArticuloNuevo=new articuloNuevo();
        SubTotalArticulo=this.ArticuloNuevo.getPrecio()-(this.ArticuloNuevo.getPrecio()*Is);
        return SubTotalArticulo;
    }

    public void setSubTotalArticulo(Integer SubTotalArticulo) {
        this.SubTotalArticulo = SubTotalArticulo;
    }
    public void PrecioTotal(articuloNuevo Precio){
        for (int j = 0; j < ARTICULO.length; j++) {
            //System.out.println(ARTICULO.Precio);
        }
        Integer a=ArticuloNuevo.Precio;
    }
    public void calcularImpuesto (){
        //this.InpuestoVenta=this.ArticuloNuevo.getPrecio()-this.SubTotalArticulo;
        System.out.println("ISV: "+this.SubTotalArticulo);
    }
    
}
