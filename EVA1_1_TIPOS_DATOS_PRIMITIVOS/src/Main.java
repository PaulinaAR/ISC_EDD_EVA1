/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus X556U
 */
public class Main {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int iVal = Integer.MAX_VALUE;//DEMOSTRACIÓN DEL TAMAÑO int (32 bits - 4 bytes)
         System.out.println("Valor más grande: " + iVal);
         iVal += 1;//overflow (desborda) límite que se sobrepasa, pues pasa de positivo a negativo
                   //stackoverflow//DESBORDAMIENTO
         System.out.println("Valor más grande: " + iVal);
         iVal = Integer.MIN_VALUE;
         System.out.println("Valor más pequeño: " + iVal);
         
         for (int i = 0; i < 10; i++){
            String mensaje = "Hola mundo";
            System.out.println(mensaje + i);
         }
            
         System.out.println(mensaje + i);//DEMOSTRACIÓN DE ALCANCE DE LAS VARIABLES.
   }
   
}
