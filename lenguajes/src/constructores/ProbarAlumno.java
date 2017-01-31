/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author T-102
 */
public class ProbarAlumno {
    public static void main(String[] args) {
        
        Alumno a=new Alumno();
        Alumno a2=new Alumno("Juan");
        
        System.out.println("Tu nombre es" +a2.getNombre());
        
        JFrame ventana=new JFrame("");
               ventana.setSize(500, 250);
               ventana.setVisible(true);
        
        
    }
}
