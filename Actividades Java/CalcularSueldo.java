/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

public class CalcularSueldo {
    public static void main(String[] args) {
        
        double sueldo=0;
        int categoria;
        
        System.out.println("Ingrese su cargo");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1 ) {
            sueldo = 15890 + (15890*0.10);
        }   
  else {
        if (categoria == 2) {
            sueldo = 26630.89;        
        }     
       
  else {
        if (categoria == 3) {
          sueldo = 35560 - (35560*0.11);
          }  
          
          
  else {
         System.out.println("Debe ingresar un número válido"); 
          }      
  
        }
  }
    if (categoria == 1 || categoria == 2 || categoria ==3 ); {    
        System.out.println("Su sueldo es " + categoria + " es igual a: " + sueldo);
    }
  }
}   