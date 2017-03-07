/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S;

/**
 *
 * @author T-102
 */
public class usuario {
    libro []libros;
    String nombre;
    String titulo;
  
   

 public void setlibros(libro[] libros){
 this.libros=libros;
 }
    public libro[] getlibros(){
    return libros;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public usuario(){}
    public usuario(libro[] libros, String nombre){
    this.libros=libros;
    this.nombre=nombre;
    
    
    
    
    }
    
}


