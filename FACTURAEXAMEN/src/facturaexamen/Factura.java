
package facturaexamen;


public class Factura implements Cloneable{
    private String FechaFactura;
    private String NumeroFactura;
    private Integer TotalPagar;
    private Integer TotalImpuesto;
    public String ListaVendedores;
    
    private Cliente Clientes[]; //AGREGACION
    private Vendedor Vendedores[]; //AGREGACION
    //private Vendedor vendedorA;
    private LineaDetalle LD[]; //COMPOSICION
    private LineaDetalle LineaD;
    private articuloNuevo Arti;
    
    private Integer MaxVendedor;
    private Integer MaxCliente;
    private Integer ContaCliente;
    private Integer ContaVendedor;
    
    public Factura(String NumeroFactura){
        
        this.FechaFactura=FechaFactura;
        this.NumeroFactura=NumeroFactura;
        MaxVendedor=6;
        MaxCliente= 10;
        Vendedores= new Vendedor[MaxVendedor];
        
        Clientes= new Cliente[MaxCliente];
        ContaCliente= -1;
        ContaVendedor= -1;
    }
    
    public void AgregarCliente(Cliente oCliente){
        ContaCliente++;
        Clientes[ContaCliente]= oCliente;        
    }
    
    public void AgregarVendedor(Vendedor oVendedores){
        ContaVendedor++;
        Vendedores[ContaVendedor]= oVendedores; 
    }
    public void calcularTotalPagar (){
        this.TotalPagar=this.Arti.getPrecio();
        //this.TotalPagar=this.Arti.PrecioTotal();
        System.out.println("Su Total a Pagar es: "+this.getTotalPagar());
    }
    
     public String listarVendedores(){          
        ListaVendedores="";
        System.out.println("LISTA DE EMPLEADOS CADENA JSON");
        for(int i= 0; i <= ContaVendedor; i++){
            System.out.println("\"Vendedor[]\": {\n"+"\"Nombre\""+": \""+Vendedores[i].getNombreCompleto()+"\",\n"
            +"\"Direccion\": \""+Vendedores[i].getDireccion()+"\",\n"+"\"ID\": \""+Vendedores[i].getId()+"\",\n"
            +"\"Sueldo\": "+Vendedores[i].getSueldo()+"\n},");
        }      
        return ListaVendedores;    
    }
    public Cliente[] ListaDeClientes(){
        return Clientes;
    }
    public Integer getCliente() {
        return ContaCliente;
    }
    public Integer getTotalImpuesto() {
        return TotalImpuesto;
    }

    public void setTotalImpuesto(Integer TotalImpuesto) {
        this.TotalImpuesto = TotalImpuesto;
    }

    public String getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(String FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public Integer getTotalPagar() {   
        return TotalPagar;
    }

    public void setTotalPagar(Integer TotalPagar) {
        this.TotalPagar = TotalPagar;
    }
    public void calcularImpuesto(){
        this.TotalImpuesto=this.LineaD.getInpuestoVenta();
        System.out.println("ISV: "+this.getTotalImpuesto());
    }
}
