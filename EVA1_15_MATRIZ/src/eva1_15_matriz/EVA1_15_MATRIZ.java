/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author asus X556U
 */
public class EVA1_15_MATRIZ {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //crear un arreglo de dos dimensiones 5 filas x 3 columnas (puros enteros)
      int iMatriz[][] = new int[5][3];
      iMatriz[0][0] = 1000;//PRIMER POSICIÓN
      iMatriz[4][2] = 2000;//ULTIMA
      System.out.println("TAMAÑO DEL ARREGLO: " + iMatriz.length);
      //CICLO X CADA DIMENSIÓN
      //CICLOS ANIDADOS (CICLO DENTRO DE OTRO CICLO)
      for (int i = 0; i < iMatriz.length; i++) {//FILAS iMatriz.length
         for (int j = 0; j < 3; j++) {//COLUMNAS
            iMatriz[i][j] = 1000;
         }
      }
      for (int i = 0; i < iMatriz.length; i++) {//FILAS iMatriz.length
         for (int j = 0; j < 3; j++){//COLUMNAS
            System.out.print("[" + iMatriz[i][j] + "]");
            }
      System.out.println("");
      }
   }  
   
}
