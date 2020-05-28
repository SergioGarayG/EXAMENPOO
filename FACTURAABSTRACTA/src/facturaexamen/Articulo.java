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
public abstract class Articulo {
    
    public abstract void SolicitarAbastecimiento();
    
    private String codigo; 
    private String Nombre; 
    protected Integer Precio; //NECESITAMOS UN ATRIBUTO INTEGER PORQUE CALCULAMOS UN IMPUESTO
    int getNombre;
    
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
}
    

