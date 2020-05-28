
package facturaexamen;

/**
 *
 * @author say
 */
public class LineaDetalle implements Cloneable{
    public static final String ANSI_YELLOW = "\033[33m";
    private Integer CantidadComprada;
    private double SubTotalArticulo=0;
    private double InpuestoVenta;
    private Integer MaxArticulos;
    private String ListaArticulo;
    
    private articuloNuevo ARTICULO[];//Instancia para la clase articuloNuevo
    private Articulo ART[];//AGREGACION
    articuloNuevo Cabeza;
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada        
        CantidadComprada=-1;
        MaxArticulos=12;
        ARTICULO= new articuloNuevo[MaxArticulos];         
        this.Cabeza = null;//Es null porque vamosñ{- a recorrer la lista entera.
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
    
    public void AgregarArticulo(articuloNuevo oArticulo){
        CantidadComprada++;
        ARTICULO[CantidadComprada]= oArticulo; 
        
    }
    
    public String ListaArticulos(){          
        ListaArticulo="";
        System.out.println(ANSI_YELLOW+"LISTA DE ARTICULOS CADENA JSON"+ANSI_YELLOW);
        for(int i= 0; i <= CantidadComprada; i++){
            System.out.println("\"Articulo[]\": {\n"+"\"Nombre\""+": \""+ARTICULO[i].getNombre()+"\",\n"
            +"\"Codigo\": \""+ARTICULO[i].getCodigo()+"\",\n"+"\"Precio\": \""+ARTICULO[i].getPrecio()+"\n},");
        }   
        return ListaArticulo;        
    }
    
    
    public void EliminarArticulo(int PorIndice){
        int CONT=0;
        articuloNuevo temp=Cabeza;
        if(PorIndice==0){
            Cabeza=Cabeza.ObtenSiguiente();
        }else{
            while(CONT<PorIndice-1){
            temp=temp.ObtenSiguiente();//Este recorre la lista y hasta que lo encuentra
            CONT++;
            }temp.EnlazarSigue(
            temp.ObtenSiguiente().ObtenSiguiente());
        }CantidadComprada--; 
    }
//ME DICE SI EL ARREGLO ESTA VACIO
    public boolean Vacia(){
        if(CantidadComprada==null){
            System.out.println("FACTURA VACIA");
            return true;
        }else{
            System.out.println("FACTURA CON ARTICULOS");
            return false;
        }
        //return (Cabeza==null)?true:false; esto es lo mismo de arriba
    }
    
   
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
         
        return InpuestoVenta;
    }

    public void setInpuestoVenta(Integer InpuestoVenta) {
        this.InpuestoVenta = InpuestoVenta;
    }
    public void ST(){
        for (int i = 0; i<= CantidadComprada; i++) {
            SubTotalArticulo+=ARTICULO[i].getPrecio()-ARTICULO[i].getPrecio()*Is;
            System.out.println(ARTICULO[i].getNombre()+" SUBTOTAL: "+(ARTICULO[i].getPrecio()-ARTICULO[i].getPrecio()*Is));
        }
    }
   
    public double getSubTotalArticulo() {       
        return SubTotalArticulo;
    }

    public void setSubTotalArticulo(Integer SubTotalArticulo) {
        this.SubTotalArticulo = SubTotalArticulo;
    }
    
    public void calcularImpuesto (){          
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
