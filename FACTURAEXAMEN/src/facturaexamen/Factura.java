
package facturaexamen;


public class Factura implements Cloneable{
    private String FechaFactura;
    private String NumeroFactura;
    private double TotalPagar=0;
    private double TotalImpuesto;
    private String ListaVendedores;
    private String ListaArticulo;
    
    private Cliente Clientes[]; //AGREGACION
    private Vendedor Vendedores[]; //AGREGACION
    //private Vendedor vendedorA;
    private LineaDetalle LD[];    //COMPOSICION
    private LineaDetalle LineaD;//para instanciar LineaDetalle que 
                                 //forman parte de la Factura composición
    
    //private articuloNuevo ARTICULO;
    //private articuloNuevo ART[];
    
    
    private Integer MaxVendedor;
    private Integer MaxCliente;
    private Integer MaxArticulo;
    private Integer ContaCliente;
    private Integer ContaVendedor;
    private Integer ContaLD;
    
    public Factura(String NumeroFactura){       
        this.FechaFactura=FechaFactura;
        this.NumeroFactura=NumeroFactura;
        MaxVendedor=6;
        MaxCliente= 10;
        MaxArticulo=200;
        Vendedores= new Vendedor[MaxVendedor];
        //ART= new articuloNuevo[MaxArticulo];
        //ARTICULO= new articuloNuevo();
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
    public void AgregarLineaDetalle(LineaDetalle oLD){
        ContaLD++;
        this.LineaD= new LineaDetalle();
        this.LineaD= (LineaDetalle)LineaD.clone();
        LD[ContaLD]= this.LineaD;   
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
    public void calcularTotalPagar (double s){ 
        this.TotalPagar=s;
        System.out.println("SU TOTAL A PAGAR ES: "+ this.getTotalPagar());
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
    public double getTotalImpuesto() {
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

    public double getTotalPagar() {
        //this.TotalPagar=this.LineaD.getSubTotalArticulo();
        return TotalPagar;
    }

    public void setTotalPagar(Integer TotalPagar) {
        this.TotalPagar = TotalPagar;
    }
    public void calcularImpuesto(double s){
        this.TotalImpuesto=s;
        System.out.println("ISV: "+this.getTotalImpuesto());
    }
}
