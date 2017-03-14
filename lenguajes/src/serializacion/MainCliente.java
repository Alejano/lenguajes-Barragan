/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class MainCliente {
    
    public static void main(String[] args) {
        ArrayList<Cliente> clientes=new ArrayList<>();
        //crear el promer cliente
        Cliente c1=new Cliente("Juan",20000,19);        
        Cliente c2=new Cliente("Pedro",16500,23);      
        Cliente c3=new Cliente("Ana",23000,20);
        // en los objetos c1,c2,c3
        //al ArrayList que se llamaClientes le agregamos uno a uno los 3 clientes
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        //iteramos el arraylist para verificar que se crearon c1,c2,c3
        
        // el valor c es solo una variable
        for(Cliente c:clientes){
            System.out.println(c);
    }
}
}


