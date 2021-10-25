/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus X556U
 */
public class EVA1_6_PASOXVAL_PASOXREF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   int valOrig =5;
   System.out.println("valOrig en el main = " + valOrig);
   incrementa(valOrig);
   //valOrig = incrementaQueSiFunciona(valOrig);
   System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);
      
      
      //DEMOSTRACIÓN DE PASO POR REFERENCIA
      Prueba objPrueba = new Prueba();
      System.out.println("Valor de la x = " + objPrueba.x);
      System.out.println("ObjPrueba en el main = " + objPrueba);
      incrementaObj(objPrueba);
      System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);
      
   }
   //PASO POR VALOR --> PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE. (VARIABLES LOCALES PRIMITIVOS)
   public static void incrementa (int val){
      val++;//incrementamos en uno val = val + 1; val +=1;
      System.out.println("VALOR EN INCREMENTA = " + val);
   }
   public static int incrementaQueSiFunciona(int val){
      val++;
      return val;
   }
   //PASO POR REFERENCIA --> PASAN LA DIRECCIÓN EN MEMORIA DEL OBJETO (OBJETOS).
   public static void incrementaObj (Prueba val){
      System.out.println("Objeto en incrementaObj = " + val);
      val.x++;
      
   }
   
}

class Prueba{
   public int x =10;
}