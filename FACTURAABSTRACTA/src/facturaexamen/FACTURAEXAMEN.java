
package facturaexamen;



public class FACTURAEXAMEN {
     public static final String ANSI_BLACK ="\033[30m";
    public static final String ANSI_RED="\033[31m";
    public static final String ANSI_GREEN = "\033[32m";
    public static final String ANSI_YELLOW = "\033[33m";
    public static final String ANSI_BLUE = "\033[34m";
    public static final String ANSI_PURPLE = "\033[35m";
    public static final String ANSI_CYAN = "\033[36m";
    public static final String ANSI_WHITE = "\033[37m";
    public static final String ANSI_RESET = "u001B[0m";
    
    public static void main(String[] args) {
        // TODO code application logic here
         //declara los objetos
        Factura oFactura;
        Cliente oCliente;
        Cliente oListaClientes[];
        Vendedor oVendedor;
        Ferreteria F;
        Articulo ANEW;
        LineaDetalle LD;
       
        
        //instancia la empresa
        
        oFactura= new Factura("COVID19TH");
        
        
        //instancia un empleado
        oVendedor= new Vendedor();
        oVendedor.setNombreCompleto("Pedro Reyniery Picapiedras");
        
        oVendedor.setId("0801199505876");
        oVendedor.setSueldo("20000.65");
        
        //agrega el empleado a la empresa
        oFactura.AgregarVendedor(oVendedor);
        
        //instancia otro empleado
        oVendedor= null;
        oVendedor= new Vendedor();
        oVendedor.setNombreCompleto("SERGIO EDUARDO ROCAMINO");
        
        oVendedor.setId("0801196656987");
        oVendedor.setSueldo("6544.8");
        
        //agrega el empleado a la empresa
        oFactura.AgregarVendedor(oVendedor);
       
        //instancia un cliente
        oCliente= new Cliente();
        oCliente.setNombreCompleto("Pablo Abraham Huerto");
        oCliente.setCreditoActivo(null);
        oCliente.setId("0702199823654");
        
        
        //agrega el cliente a la empresa
        oFactura.AgregarCliente(oCliente);
        
        //instancia un nuevo cliente
        oCliente= null;
        oCliente= new Cliente();
        oCliente.setNombreCompleto("Pedro Isaac Madero");
        oCliente.setId("0702199823654");
        oCliente.setCreditoActivo(true);
        
        //agrega el nuevo cliente a la empresa
        oFactura.AgregarCliente(oCliente);

        //lista los Veendedores, regresa una cadena   
        System.out.println(oFactura.listarVendedores());
        System.out.println("================================================");           
        //lista de clientes, regresa un arreglo con los objetos
        //luego lista ese arreglo
        oListaClientes= oFactura.ListaDeClientes();
        System.out.println("\n\nLista de Clientes");
        for(int i= 0; i <= oFactura.getCliente(); i++){
            System.out.print("Nombre Completo: "); 
            System.out.println(oListaClientes[i].getNombreCompleto());
            
            System.out.print("Credito: "); 
            System.out.println(oListaClientes[i].getCreditoActivo()+"\n"); 
       }    
       System.out.println(ANSI_PURPLE+"================================================"+ANSI_PURPLE); 
       
       LD=new LineaDetalle();//INSTANCIO LINEA DETALLE PORQUE AQUI AGREGO MIS ARTICULOS
       
       ANEW=new Ferreteria();
       
       ANEW.setNombre("MARTILLO");
       ANEW.setCodigo("12345");
       ANEW.setPrecio(234);
       LD.AgregarArticulo(ANEW);
       
       ANEW= null;
       
       ANEW=new Ferreteria();
       ANEW.setNombre("HACHA");
       ANEW.setCodigo("34562");
       ANEW.setPrecio(876);
       LD.AgregarArticulo(ANEW);
       
       
       ANEW= null;
       ANEW=new Ferreteria();
       ANEW.setNombre("HAC");
       ANEW.setCodigo("345d");
       ANEW.setPrecio(120);
       LD.AgregarArticulo(ANEW);
       
       ANEW= null;
       ANEW=new Ferreteria();
       ANEW.setNombre("CLAVOS");
       ANEW.setCodigo("345d");
       ANEW.setPrecio(125);
       LD.AgregarArticulo(ANEW);
       
       ANEW=new Comestible();//INSTANCIA PARA COMESTIBLE
       ANEW.setNombre("POLLO HORNADO");
       ANEW.setCodigo("PIO");
       ANEW.setPrecio(125);
       LD.AgregarArticulo(ANEW);
       
       ANEW= null;
       ANEW=new Comestible();
       ANEW.setNombre("ChULETA FRITA");
       ANEW.setCodigo("345d");
       ANEW.setPrecio(145);
       
       LD.AgregarArticulo(ANEW);
       //AHORA IMPRIME LOS ARTICULOS CADA UNO CON SU PROPIEDAD
       System.out.println("FERRETERIA");
       System.out.println(LD.ListaArticulos());
       
       oFactura.AgregarLineaDetalle(LD);//ESTA AGREGA FACTURA ACA VEMOS LA COMPOSICION
                                        //DESDE LINEADETALLE HASTA FACTURA
       System.out.println(oFactura.ListaArticulos());
       System.out.println("TOTAL ARTICULOS COMPRADOS: "+LD.getCantidadComprada());
      
       System.out.println(ANSI_PURPLE+"================================================"+ANSI_PURPLE); 
       
      /* LD.ELIMINARArticulo("HACHA");
       System.out.println(LD.ListaArticulos());
       
       System.out.println("================================================");
       */
       //AHORA HAREMOS LOS CALCULOS
       LD.ST();//ESTE METODO CALCULA EL SUBTOTAL EN LA CLASE LINEADETALLE
       System.out.println("");
       LD.IV();//ESTE METODO CALCULA EL ISV EN LA CLASE LINEADETALLE
       System.out.println("");
       LD.calcularImpuesto();//
       System.out.println("");
       System.out.println("SUBTOTAL ARTICULOS: "+LD.getSubTotalArticulo()+"\n");
       LD.T();;//ESTE METODO CALCULA EL TOTAL EN LA CLASE LINEADETALLE
       
       System.out.println(ANSI_PURPLE+"================================================"+ANSI_PURPLE); 
       double ISV,TP;
       ISV=LD.getInpuestoVenta();
       oFactura.calcularImpuesto(ISV);;//ESTE METODO CALCULA EL IMPUESTO EN FACTURA POR MEDIO DE COMPOSICION
       TP=LD.getSubTotalArticulo();
       oFactura.calcularTotalPagar(TP);//ESTE EL TOTAL A PAGAR
       System.out.println(ANSI_PURPLE+"================================================"+ANSI_PURPLE); 
         //INTENTAREMOS ELIMINAR UN ARTICULO
       //ANEW.setNombre("HACHA");
       
       
       System.out.println(ANSI_PURPLE+"================================================"+ANSI_PURPLE); 
       //AHORA LLAMAREMOS A LAS CLASES HIJAS DE ARTICULONUEVO
       F=new Ferreteria();
       F.SolicitarAbastecimiento();
       F.setArea("CONSTRUCCION");
       F.getArea();
       Comestible C=new Comestible();
       C.SolicitarAbastecimiento();
       //MANDAMOS A LLAMAR LA HORA Y FECHA FACTURA
       oFactura.getFechaFactura();
        
       //NUMERO DE FACTURA
       oFactura.setNumeroFactura(300);
        System.out.println("#FACTURA: "+oFactura.getNumeroFactura());//GENERA UN NUMERO ALEATORIO CADA VEZ QUE COMPILA
      
       System.out.println(ANSI_PURPLE+"=== Borrar ==="+ANSI_PURPLE);
       oFactura= null;
       System.gc();
       //oListaClientes= oFactura.ListaDeClientes();
       System.out.println(oListaClientes[0].getNombreCompleto());
       
       //Ahora agregamos los articulos
       
       
    }
    
}
