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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int valores[]={5,-2,5};
        System.out.println( valores[1]);
        int []dos={23,-8};
        int tres[]=new int[3];
        tres[1]=100;
         tres[2]=5;
          tres[0]=90;
        System.out.println(tres[1]);
        
        for(int i=0;i<3;i++){
            System.out.println(tres[i]);
        };
        System.out.println("valor");

 /*nuevo ciclo for*/
 
  for(int i:tres){
      System.out.println(i);
  };
  
  String saludo[]={"hola" ,"como", "estas"};
 
  for(String x:saludo){
      System.out.println(x);
  };
  
Comportamiento patos[]=new Comportamiento[5];
 patos[0]=new mexicano();
patos[1]=new mexicano();
patos[2]=new europeo();
patos[3]=new europeo();
patos[4]=new canadiense();

      for(Comportamiento p:patos){
          p.volar();
          
      };
      
 
      

     }
}

  
 
 
 
      
        
        
   

   
