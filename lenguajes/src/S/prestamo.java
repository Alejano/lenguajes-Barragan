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
public class prestamo extends libro{
    
    public static void pertarAlumno(alumno alumno)throws Exception{
    
        if(alumno.getlibros().length>=3) {
            throw  new Exception();
        } else {
        }
    }
    
     public static void pertarProf(prof prof)throws Exception{
    
        if(prof.getlibros().length>=2) {
            throw  new Exception();
        } else {
        }
    }
}
