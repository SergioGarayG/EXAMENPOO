
package facturaexamen;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class FACTURAEXAMEN {

    
    public static void main(String[] args) {
        // TODO code application logic here
         //declara los objetos
        Factura oFactura;
        Cliente oCliente;
        Cliente oListaClientes[];
        Vendedor oVendedor;
        articuloNuevo ANEW;
        LineaDetalle LD;
        Ferreteria F=new Ferreteria();
        
        //instancia la empresa
        
        oFactura= new Factura("Mi Empresa");
        
        
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
       System.out.println("================================================"); 
       
       LD=new LineaDetalle();//INSTANCIO LINEA DETALLE PORQUE AQUI AGREGO MIS ARTICULOS
       ANEW=new articuloNuevo();
       ANEW.setNombre("MARTILLO");
       ANEW.setCodigo("12345");
       ANEW.setPrecio(234);
       LD.AgregarArticulo(ANEW);
       
       ANEW= null;
       
       ANEW=new articuloNuevo();
       ANEW.setNombre("HACHA");
       ANEW.setCodigo("34562");
       ANEW.setPrecio(876);
       LD.AgregarArticulo(ANEW);
       
       
       ANEW= null;
       ANEW=new articuloNuevo();
       ANEW.setNombre("HAC");
       ANEW.setCodigo("345d");
       ANEW.setPrecio(120);
       LD.AgregarArticulo(ANEW);
       
       ANEW= null;
       ANEW=new articuloNuevo();
       ANEW.setNombre("CLAVOS");
       ANEW.setCodigo("345d");
       ANEW.setPrecio(125);
       LD.AgregarArticulo(ANEW);
       
       
       //AHORA IMPRIME LOS ARTICULOS CADA UNO CON SU PROPIEDAD
       System.out.println(LD.ListaArticulos());
       
       oFactura.AgregarLineaDetalle(LD);
       System.out.println(oFactura.ListaArticulos());
       System.out.println("\nTOTAL ARTICULOS COMPRADOS: "+LD.getCantidadComprada());
      
       System.out.println("================================================");
       //AHORA HAREMOS LOS CALCULOS
       LD.ST();//ESTE METODO CALCULA EL SUBTOTAL EN LA CLASE LINEADETALLE
       LD.IV();//ESTE METODO CALCULA EL ISV EN LA CLASE LINEADETALLE
       LD.calcularImpuesto();//
       LD.T();;//ESTE METODO CALCULA EL TOTAL EN LA CLASE LINEADETALLE
       //oFactura.calcularImpuesto(subt1);
       System.out.println("SUBTOTAL ARTICULOS: "+LD.getSubTotalArticulo());
       
       //AHORA LLAMAREMOS A LAS CLASES HIJAS DE ARTICULONUEVO
       
       F.SolicitarAbastecimiento();
       F.setArea("CONSTRUCCION");
       
       Comestible C=new Comestible();
       C.SolicitarAbastecimiento();
       //MANDAMOS A LLAMAR LA HORA Y FECHA FACTURA
       oFactura.getFechaFactura();
        
       //NUMERO DE FACTURA
       oFactura.setNumeroFactura(300);
        System.out.println("#FACTURA: "+oFactura.getNumeroFactura());//GENERA UN NUMERO ALEATORIO CADA VEZ QUE COMPILA
      
       System.out.println("=== Borrar ===");
       oFactura= null;
       System.gc();
       //oListaClientes= oFactura.ListaDeClientes();
       System.out.println(oListaClientes[0].getNombreCompleto());
       
       //Ahora agregamos los articulos
       
       
    }
    
}
