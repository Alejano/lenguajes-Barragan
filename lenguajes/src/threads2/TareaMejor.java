/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;

/**
 *Segunda forma de crear threads
 * implementando la interface Runnable
 * @author T-102
 */
public class TareaMejor implements Runnable{
    
    public static void main(String[] args) {
        //crear thread
        
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        
        //iniciarlo
        
        t1.start();
        
        
    }

    @Override
    public void run() {
        
        System.out.println("Soy un thread mejor");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
