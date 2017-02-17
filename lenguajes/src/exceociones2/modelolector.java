/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceociones2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author T-102
 */
public class modelolector {
    //tipo de clase= modelo
    
    public String leerArchivo(File file) throws FileNotFoundException, IOException{
    String informacion="nada";
    
        FileInputStream fis=new FileInputStream(file);//encadenamiento de objetos por constructor
        
        StringBuilder builder=new StringBuilder();//acumula la informacion leida
        int ch;
        
        while((ch=fis.read())!=-1){
        
        builder.append((char)ch);
                        //casting 
                        
        informacion=builder.toString();
                
        }
        
        
    return informacion;
    }
    
}
