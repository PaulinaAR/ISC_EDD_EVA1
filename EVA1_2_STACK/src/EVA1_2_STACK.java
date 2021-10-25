/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus X556U
 */
public class EVA1_2_STACK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("INICIA MAIN");
      A();
      System.out.println("TERMINA MAIN");
   }
   
   public static void A(){
      System.out.println("INICIA A");
      B();
      System.out.println("TERMINA A");
   }
   public static void B(){
      System.out.println("INICIA B");
      int i = 5;
      double d = 5.5;
      System.out.println("TERMINA B");
   }
   
}
/* NOTA: Stack lo que hace es suspender los métodos que inicializan para poder
continuar, una vez finalizado todo el proceso, se devuelve hasta el principal.
(main).

*/