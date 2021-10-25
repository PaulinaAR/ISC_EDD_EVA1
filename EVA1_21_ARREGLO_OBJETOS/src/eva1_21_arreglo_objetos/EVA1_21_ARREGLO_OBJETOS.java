/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author asus X556U
 */
public class EVA1_21_ARREGLO_OBJETOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      Persona[] aPersonas = new Persona[10];//ARREGLO TAMAÑO 10 QUE ALMACENA OBJETOS DE TIPO PERSONA
      //PARA USAR UN OBJETO, DEBEN CREARLO
      //PARA CREAR UN OBJETO USAN NEW
      //SI NO LO CREAN, NO EXISTE
      for (int i = 0; i < aPersonas.length; i++) {
         aPersonas[i] = new Persona(); //CREO UN OBJETO DE TIPO PERSONA EN LA POSICIÓN i
         System.out.println("Introduce un nombre: ");
         String nombre = input.nextLine();
         aPersonas[i].setNombre(nombre);
      }
      for (int i = 0; i < aPersonas.length; i++) {
         System.out.println("Nombre: " + aPersonas[i].getNombre());
         
      }
   }
}
class Persona{
   private String nombre;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
}
