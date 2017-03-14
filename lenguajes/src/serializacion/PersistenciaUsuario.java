/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.*;
/**
 *
 * @author T-102
 */
public class PersistenciaUsuario {
    
    public void guardar(Usuario u)throws Excepcion{
    File file=new File("basesita-usuarios");
    FileOutputStream oos=new ObjectOuputStream(fos);
    oos.wrieteObject(u);
    
    }
    
}
