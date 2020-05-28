
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
    
    //private articuloNuevo ARTICULO[];//Instancia para la clase articuloNuevo
    private Articulo ART[];//AGREGACION HICIMOS UNA SOLA CLASE CON Articulo y articuloNuevo
   
    
    public LineaDetalle(){//CONSRUCTOR PARA INICIALIZAR CantidadComprada        
        CantidadComprada=-1;
        MaxArticulos=12;
        ART= new Articulo[MaxArticulos];  
       
        
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
    
    public void AgregarArticulo(Articulo oArticulo){
        CantidadComprada++;
        ART[CantidadComprada]= oArticulo; 
        
    }
    
    public String ListaArticulos(){          
        ListaArticulo="";
        System.out.println("LISTA DE ARTICULOS CADENA JSON");
        for(int i= 0; i <= CantidadComprada; i++){
            System.out.println("\"Articulo[]\": {\n"+"\"Nombre\""+": \""+ART[i].getNombre()+"\",\n"
            +"\"Codigo\": \""+ART[i].getCodigo()+"\",\n"+"\"Precio\": \""+ART[i].getPrecio()+"\n},");
        }   
        return ListaArticulo;        
    }
    
    
    public boolean ELIMINARArticulo(int oArticulo){       
        boolean resultado = false;
        int i= 0;
        
        while(i<CantidadComprada){
             if (ART[i].getNombre== oArticulo) {
                for (int j = i; j < CantidadComprada - 1; j++) {
                    ART[j] = null;
                   
                }          
                ART[ART.length-1]=null;
                resultado = true;
               
            }
             i++;
        }       
        return resultado;
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
            InpuestoVenta+=ART[i].getPrecio()*Is;
            System.out.println(ART[i].getNombre()+" SU IMPUESTO ES :"+ART[i].getPrecio()*Is);
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
            SubTotalArticulo+=ART[i].getPrecio()-ART[i].getPrecio()*Is;
            System.out.println(ART[i].getNombre()+" SUBTOTAL: "+(ART[i].getPrecio()-ART[i].getPrecio()*Is));
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
            x+=ART[i].getPrecio();
            System.out.println("TOTAL A PAGAR POR "+ART[i].getNombre()+" ES: "+ART[i].getPrecio());
        }
        System.out.println("TOTAL A PAGAR POR TODO: "+(this.getInpuestoVenta()+this.getSubTotalArticulo()));
    }
}
