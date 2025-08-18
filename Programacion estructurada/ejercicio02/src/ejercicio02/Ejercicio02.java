
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int num1, num2, num3, mayor;
        
        
        System.out.println("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer número entero: ");
        num3 = Integer.parseInt(input.nextLine());
        
         if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        }   else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        }   else {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);

        
        
        
        
        
        
        
        
    }

}
