
package facturaexamen;


public class articuloNuevo{
    
    private String codigo; 
    private String Nombre; 
    protected Integer Precio; //NECESITAMOS UN ATRIBUTO INTEGER PORQUE CALCULAMOS UN IMPUESTO
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    Integer temp;
    public Integer getPrecio() {
        return Precio;       
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio; 
        temp=Precio;
        
    }
   
    public Integer PrecioTotal(){ 
        Precio+=temp;
        /*Integer temp;
        
        if(Precio==null) {
            Precio=temp;
            //Precio++;
        }else{
            Precio+=temp;
        }*/
        
        System.out.println("SU PRECIO TOTAL ES: "+this.getPrecio());
        return Precio;
    }
}
