/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.*;
/**
 *aqui se introduce la logica para 
 * @author T-102
 */
public class PersistenciaUsuario {
 
    /*
      Primer metodo de tipo accion guardar
    */
    public void guardar(Usuario u)throws Exception{
        File file=new File("basesita-usuarios");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(u);
    }
    
    /*
    primero obtenemos la busqueda, para el boton busqueda aqui esta la logica
    paso 2 ir a la clase usuario y verificar que tengan el constructor que inicializa los atributos
    
    */
    public Usuario busarPorNombre(String nombre)throws Exception{
        File file=new File("basesita-usuarios");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario encontrado=null;
   Usuario u=     (Usuario) ois.readObject();
       //Comparamos
       if(u.getNombre().equals(nombre))encontrado=u;
       return encontrado;
    }

}
