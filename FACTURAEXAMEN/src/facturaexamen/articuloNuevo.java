
package facturaexamen;


public class articuloNuevo{
    private String valor;
    private articuloNuevo Siguiente;
    
    private String codigo; 
    private String Nombre; 
    protected Integer Precio; //NECESITAMOS UN ATRIBUTO INTEGER PORQUE CALCULAMOS UN IMPUESTO
    
    public articuloNuevo() {
        this.valor = valor;
        this.Siguiente=null;
    }
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
    
    public Integer getPrecio() {
        return Precio;       
    }
    
    public void EnlazarSigue(articuloNuevo m){
        this.Siguiente=m;
    }
    //returna o regresa un lemento nodo
    public articuloNuevo ObtenSiguiente(){
        return Siguiente;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;   
    }
    
    
}
