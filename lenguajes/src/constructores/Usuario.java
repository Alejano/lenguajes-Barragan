/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Usuario {
  private String nombre;
  private String Apaterno;
  private int edad;
  private int matricula;

   
  
   public Usuario(String nombre){
     this.nombre=nombre;
     }
     
     public Usuario(String nombre,String Apaterno){
     this.nombre=nombre;    
     this.Apaterno=Apaterno;
     }
    public Usuario(int edad){
        this.edad=edad;
     }
    public Usuario(int matricula,int edad){
        this.edad=edad;
        this.matricula=matricula;
     }

    
    public Usuario(String nombre, String Apaterno, int edad,int matricula){
     this.nombre=nombre;
     this.Apaterno=Apaterno;
     this.edad=edad;
     this.matricula=matricula;
     }
    
  
  
  
    
}
