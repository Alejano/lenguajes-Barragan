/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author T-102
 */
public class Aplicacionpatos {
    public static void main(String[] args) {
        canadiense pc1=new canadiense();
        canadiense pc2=new canadiense();
        System.out.println(canadiense.color);
        
        europeo pc3=new europeo();
        europeo pc4=new europeo();
       System.out.println(europeo.color);
        
        mexicano pc5=new mexicano();
        mexicano pc6=new mexicano();
        System.out.println(mexicano.color);
        
        pc1.comer();
        
        pc1.volar();
    
    }
}
