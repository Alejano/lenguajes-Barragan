/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-102
 */
public class Cliente {
    
    String nombre;
    float sueldo;
    int edad;
    
    //metodo toString

    @Override
    public String toString() {
      return "Nombre: "+nombre+"   sueldo: "+sueldo+"   edad: "+edad;
    }
    
    
    public Cliente(String nombre, float sueldo, int edad){
    
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.edad=edad;
        
    }
    public Cliente(){}
    
//getters and setters para poder mandar los valores
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

  
}
