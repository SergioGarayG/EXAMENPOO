/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaexamen;

/**
 *
 * @author say
 */
public class articuloNuevo{
    
    private String codigo; 
    private String Nombre; 
    private Integer Precio; //NECESITAMOS UN ATRIBUTO INTEGER PORQUE CALCULAMOS UN IMPUESTO

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

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }
    
    public Integer PrecioTotal(){ 
        Integer temp;
        temp=Precio;
        if(temp==null){
            return Precio=temp;
        }else{
            if(temp!=null){
                return Precio=temp+Precio;
            }
        }
        return Precio;
    }
}
