/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads3;

/**
 *3° forma
 * usando clases internas anonimas Backgroud thread
 * @author T-102
 */
public class LaMejor {
    
    public static void main(String[] args) {
                       //clase interna anonima new
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                //clase interna anonima
                System.out.println("Yo soy la chida");
                
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                              }
            
        });
        
        t1.start();
    }
    
}
