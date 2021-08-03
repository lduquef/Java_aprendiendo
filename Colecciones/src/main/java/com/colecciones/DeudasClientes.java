
package com.colecciones;
import java.util.*;
public class DeudasClientes {
    public static void main(String[] args){
        Cliente cliente1=new Cliente("María Pacheco","001",30000);
        Cliente cliente2=new Cliente("Juan Zapata","002",60000);
        Cliente cliente3=new Cliente("Miguel Carrillo","003",80000);
        Cliente cliente4=new Cliente("Patricia Negro","004",50000);
        
//        Set <Cliente> clientesTienda = new HashSet<>(); 
//        clientesTienda.add(cliente1);
//        clientesTienda.add(cliente2);
//        clientesTienda.add(cliente3);
//        clientesTienda.add(cliente4);
//        ---------------------------
//        acá vamos a controuir un array
//        ---------------------------        
        ArrayList<Cliente> clientesTienda = new ArrayList<Cliente>();
        clientesTienda.add(cliente1);
        clientesTienda.add(cliente2);
        clientesTienda.add(cliente3);
        clientesTienda.add(cliente4);
        System.out.println(clientesTienda.size());
        for(Cliente cliente:clientesTienda){
            System.out.println(cliente.getNombre()+" "+cliente.getcodigo()+" "+cliente.getdeuda()) ;
        }
            
    }
}
