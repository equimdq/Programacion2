
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo número; ");
        num2 = Integer.parseInt( input.nextLine());
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        double division;
        division = (double) num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        
        
     
    }

}
