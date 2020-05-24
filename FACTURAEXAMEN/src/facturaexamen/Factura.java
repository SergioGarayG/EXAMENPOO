
package facturaexamen;


public class Factura {
    private String FechaFactura;
    private String NumeroFactura;
    private Integer TotalPagar;
    private Integer TotalImpuesto;
    
    private Cliente Clientes[]; //AGREGACION
    private Vendedor Vendedores[]; //AGREGACION
    private LineaDealle LD[]; //COMPOSICION
    private LineaDealle LineaD;
    
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

    public void calcularTotalPagar (){
  
        return;
<<<<<<< HEAD
    }
      public void calcularImpuesto(){
  
        return;
    }
     
=======
}
      public void calcularImpuesto(){
  
        return;
}
    
    
>>>>>>> c9b690c61668a5218c58123b8e07680793fbe829
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
