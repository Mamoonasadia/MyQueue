/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Queuetest {
   
   
   public static void main(String[] args)
      {
      Queue Q = new Queue(5);  

      Q.push(10);            
      Q.push(20);
      Q.push(30);
      Q.push(40);

      Q.pop();              
      Q.pop();              
      Q.pop();

      Q.push(50);            
      Q.push(60);            
      Q.push(70);
      Q.push(80);

      while( !Q.isEmpty() )   
         {                            
         long n = Q.pop();  
         System.out.print(n);
     
      } 
      }
}
     
    



    

