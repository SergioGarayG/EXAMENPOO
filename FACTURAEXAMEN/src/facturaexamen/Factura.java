
package facturaexamen;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Factura implements Cloneable{
    private String FechaFactura;
    private int NumeroFactura;
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
    
    private Integer MaxVendedor;
    private Integer MaxCliente;
    private Integer MaxArticulo;
    private Integer ContaCliente;
    private Integer ContaVendedor;
    private Integer ContaLD;
    
    public Factura(String NOMBREFactura){       
        
        MaxVendedor=6;
        MaxCliente= 10;
        MaxArticulo=200;
        Vendedores= new Vendedor[MaxVendedor];
        Clientes= new Cliente[MaxCliente];
        LD= new LineaDetalle[MaxArticulo];
        ContaCliente= -1;
        ContaVendedor= -1;
        ContaLD= -1;
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
        this.LineaD= (LineaDetalle)oLD.clone();
        LD[ContaLD]= this.LineaD;   
    }
    
    public String ListaArticulos(){ 
        System.out.println("FACTURA: ");
        //AQUI ACCEDEMOS DIRECTO AL METODO
        ListaArticulo=this.LineaD.ListaArticulos();   
        return ListaArticulo;        
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

    public String getFechaFactura() {
        //FECHA DE FACTURA
        Scanner entrada=new Scanner(System.in);
        Date fecha=new Date();
        int año=fecha.getYear();
        int dia=fecha.getDate();
        int mes=fecha.getMonth();
        int hora,minutos,segundos;
        System.out.println("FECHA FACTURA: "+(año+1900)+"/"+(mes+1)+"/"+dia);
        
        Calendar calendario=Calendar.getInstance();
        año=calendario.get(Calendar.YEAR);
        dia=calendario.get(Calendar.DATE);
        calendario.setTime(fecha);
        //HORA DE FACTURA
        hora=calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND);
        System.out.println("HORA: "+hora+":"+minutos+":"+segundos);
        return FechaFactura;
    }

    public void setFechaFactura(String FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public String getNumeroFactura() {
        return this.num;
    }
    private final int cont=1;
    private String num="";
    public void setNumeroFactura(int NumeroFactura) {
    
        this.NumeroFactura = NumeroFactura;
        if((this.NumeroFactura>=1000) || (this.NumeroFactura<1000)){
            int can=cont+this.NumeroFactura;
            num=""+can;
        } 
        if((this.NumeroFactura>=100) || (this.NumeroFactura<100)){
            int can=cont+this.NumeroFactura;
            num=""+can;
        }
        if((this.NumeroFactura>=9) || (this.NumeroFactura<100)){
            int can=cont+this.NumeroFactura;
            num="00"+can;
        }
        if((this.NumeroFactura<9)){
            int can=cont+this.NumeroFactura;
            num="000"+can;
        }
    }

    public double getTotalPagar() {   
        return TotalPagar;
    }

    public void setTotalPagar(Integer TotalPagar) {       
        //AQUI ACCEDEMOS DIRECTO AL METODO 
        this.TotalPagar = TotalPagar;
    }
    public void calcularTotalPagar (double TP){ 
        TotalPagar=TP+TotalImpuesto;
        System.out.println("TOTAL A PAGAR FACTURA: "+this.getTotalPagar());
    }
    public double getTotalImpuesto() {          
        return TotalImpuesto;
    }

    public void setTotalImpuesto(Integer TotalImpuesto) {
        this.TotalImpuesto = TotalImpuesto;
    }
    public void calcularImpuesto(double ISV){      
        TotalImpuesto=ISV;
        System.out.println("ISV CLASE FACTURA: "+this.getTotalImpuesto());
    }
}
