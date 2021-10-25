/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus X556U
 */
public class EVA1_3_STACKOVERFLOW {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      A();
   }
   
   public static void A(){
      B();
   }
   
   public static void B(){
      A();
   }
   
}
