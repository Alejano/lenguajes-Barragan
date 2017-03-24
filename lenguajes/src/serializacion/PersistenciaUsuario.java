/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.*;
import java.util.ArrayList;
/**
 *aqui se introduce la logica para 
 * @author T-102
 */
public class PersistenciaUsuario {
 
    /*
      Primer metodo de tipo accion guardar
    */
    ArrayList<Usuario> usuarios=new ArrayList<>();
    
    public void guardar(Usuario u)throws Exception{
        File file=new File("tabla-usuario");
        if(file.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);//aqui guarda el objeto
    }
    
    //buscar todos
    public ArrayList<Usuario> buscarTodos()throws Exception{
    File file=new File("tabla-usuario");
    FileInputStream fis=new FileInputStream(file);
     ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios= (ArrayList<Usuario>) ois.readObject();
     return usuarios;
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
    
    //buscar por id
    
    public Usuario buscarPorID(int id)throws Exception{
        Usuario buscado=null;
        usuarios= buscarTodos();
        //comienza la busqueda
        buscado= usuarios.get(id);
        
    return buscado;
    }

}


//agrega la operacion borrar por id y actualizar por id