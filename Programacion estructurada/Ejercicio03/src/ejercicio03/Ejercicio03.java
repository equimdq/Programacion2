
package ejercicio03;

import java.util.Scanner;


public class Ejercicio03 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Su etapada de vida es: Niño");
            
            } else if (edad >= 12 && edad <= 17) {
            System.out.println("Su etapa de vida es: Adolescente");
            
            } else if (edad >= 18 && edad <= 59) {
        
            System.out.println("Su etapa de vida es: Adulto");
            
        } else {
        System.out.println("Su etapa de vida es: Adulto mayor");
}

            
        }
               
    }