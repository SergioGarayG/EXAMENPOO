
package facturaexamen;


public class Factura {
    private String FechaFactura;
    private String NumeroFactura;
    private Integer TotalPagar;
    private Integer TotalImpuesto;
    public String ListaVendedores;
    
    
    private ArticuloNuevo ArticuloNuevo;
    
    
    private Cliente Clientes[]; //AGREGACION
    private Vendedor Vendedores[]; //AGREGACION
    private LineaDetalle LD[]; //COMPOSICION
    private LineaDetalle LineaD;
    
    private Integer MaxVendedor;
    private Integer MaxCliente;
    private Integer ContaCliente;
    private Integer ContaVendedor;
    
    public Factura(String FechaFactura, String NumeroFactura){
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
    
    public void agregarVendedor(Vendedor oVendedores){
       ContaVendedor++;
        Vendedores[ContaVendedor]= oVendedores; 
        
    }
    public void calcularTotalPagar (){
        this.TotalPagar=this.ArticuloNuevo.PrecioTotal ();
        System.out.println("El total a pagar es " + this.getTotalPagar());
        
  
       
    }
      public void calcularImpuesto(){
  
        this.TotalImpuesto=this.LineaD.getInpuestoVenta();
          System.out.println("ISV: "+this.getTotalImpuesto() );
        
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
}
