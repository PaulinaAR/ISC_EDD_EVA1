/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author asus X556U
 */
public class EVA1_23_NUMEROS_PRIMOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce el número: ");
      int iVal = input.nextInt();
      boolean esPrimo = true;
      for (int i = 2; i < iVal; i++) {
         //DIVISIÓN: iVal/i --> DIVISIÓN EXACTA --> NO ES PRIMO
         //JAVA EL MODULO ES % --> NUM1 % NUM2
         //7 % 5 = 2 DIVISIÓN CON RESIDUO DIFERENTE A CERO
         //15 % 3  = 0 DIVISIÓN EXACTA
         int iMod = iVal % i;
         if (iMod == 0) {//Modulo es igual a cero, no es primo, hay que terminar
            esPrimo = false;
            break;//DETIENE PERMANENTEMENTE EL FOR
            //continue;//DETIENE LA ITERACIÓN ACTUAL
         }
         //Si la división no es exacta -->terminamos NO ES PRIMO
         //Si terminamos el for sin dividir exactamente: ES PRIMO
      }
      //IMPRIMIR SI ES PRIMO O NO
      if(esPrimo)
         System.out.println("El numero es primo");
      else
         System.out.println("El numero no es primo");
   }
}
