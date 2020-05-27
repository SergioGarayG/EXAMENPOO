
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle implements Cloneable{
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
    public Object clone(){ 
        Object obj= null;
        try{
            obj= super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println(" NO PUDO DUPLICARSE");
        }
        return obj;
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
    double Is=0.25;
    public void IV(){
        for (int i = 0; i<= CantidadComprada; i++) {
            InpuestoVenta+=ARTICULO[i].getPrecio()*Is;
            System.out.println(ARTICULO[i].getNombre()+" SU IMPUESTO ES :"+ARTICULO[i].getPrecio()*Is);
        }
    }
    public double getInpuestoVenta() {
         //this.InpuestoVenta=this.getSubTotalArticulo()*Is;
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    public void ST(){
        for (int i = 0; i<= CantidadComprada; i++) {
            SubTotalArticulo+=ARTICULO[i].getPrecio()-ARTICULO[i].getPrecio()*Is;
            System.out.println(ARTICULO[i].getNombre()+" subtotal: "+(ARTICULO[i].getPrecio()-ARTICULO[i].getPrecio()*Is));
        }
    }
    /*public void ST(){
        for (int i = 0; i<= CantidadComprada; i++) {
            SubTotalArticulo+=ARTICULO[i].getPrecio();
            System.out.println(ARTICULO[i].getPrecio());
        }
    }*///METODO PARA SACAR EL TOTAL A PAGAR
    
    public double getSubTotalArticulo() {       
        //ArticuloNuevo=new articuloNuevo();
      
        return SubTotalArticulo;
    }

    public void setSubTotalArticulo(Integer SubTotalArticulo) {
        this.SubTotalArticulo = SubTotalArticulo;
    }
    
    public void calcularImpuesto (){   
        //this.InpuestoVenta=x;
        /*for (int i = 0; i<= CantidadComprada; i++) {
            SubTotalArticulo+=ARTICULO[i].getPrecio();
            System.out.println(ARTICULO[i].getPrecio());
        }*/
        System.out.println("ISV: "+this.getInpuestoVenta());
    }
    public void T(){
        double x=this.InpuestoVenta+this.SubTotalArticulo;
        for (int i = 0; i<= CantidadComprada; i++) {
            x+=ARTICULO[i].getPrecio();
            System.out.println("TOTAL A PAGAR POR "+ARTICULO[i].getNombre()+" ES: "+ARTICULO[i].getPrecio());
        }
        System.out.println("TOTAL A PAGAR POR TODO: "+(this.getInpuestoVenta()+this.getSubTotalArticulo()));
    }
}
