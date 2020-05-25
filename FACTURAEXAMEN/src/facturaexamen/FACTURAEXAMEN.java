
package facturaexamen;


public class FACTURAEXAMEN {

    
    public static void main(String[] args) {
        // TODO code application logic here
         //declara los objetos
        Factura oFactura;
        Cliente oCliente;
        Cliente oListaClientes[];
        Vendedor oVendedor;
        
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
        oCliente= new Cliente();
        oCliente.setNombreCompleto("Pedro Isaac Madero");
        oCliente.setId("0702199823654");
        oCliente.setCreditoActivo(true);
        
        //agrega el nuevo cliente a la empresa
        oFactura.AgregarCliente(oCliente);

        //lista los empleados, regresa una cadena   
        System.out.println(oFactura.listarVendedores());
                  
        //lista de clientes, regresa un arreglo con los objetos
        //luego lista ese arreglo
        oListaClientes= oFactura.ListaDeClientes();
        System.out.println("\n\nLista de Clientes");
        for(int i= 0; i <= oFactura.getCliente(); i++){
            System.out.print("Nombre: "); 
            System.out.println(oListaClientes[i].getNombreCompleto());
            
            System.out.print("Credito: "); 
            System.out.println(oListaClientes[i].getCreditoActivo()); 
       }    
        
       System.out.println("=== Borrar ===");
       oFactura= null;
       System.gc();
       //oListaClientes= oEmpresa.ListarClientes();
       System.out.println(oListaClientes[0].getNombreCompleto());
    }
    
}
