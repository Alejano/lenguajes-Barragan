/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceociones2;

/**
 *
 * @author T-102
 */
import java.io.*;

public class ValidacionArchivos {
    public static void ValidarExtencion(File file) throws ExtencionNoValidaException{
    
        //preguntamos el nombre
        String nombre= file.getName();
        
        int indice1= nombre.indexOf(".");
        int indice2=  nombre.length();
        String extencion=nombre.substring(indice1-1, indice2);
        
        if(extencion.equals("txt"))
            throw new ExtencionNoValidaException();
        
        //lanza un nuevo objeto
        //throw new ExtencionNoValidaException();
        
    }
}
