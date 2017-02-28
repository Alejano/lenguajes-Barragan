/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 */
public class AplicacionThread1 {
    public static void main(String[] args) {
        //creado
        TareaMensa t1=new TareaMensa();
        //iniciado
        t1.start();
        
        //ejecucion
         // t1.run();
      try{
      Thread.sleep(5000);
      t1.start();
      }catch(InterruptedException e){
      
      }
        
        //muerte viene cuando termina su ejecucion
   
    }
}
