
package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado2;
        double resultado;
      
        
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt( input.nextLine());
        
        resultado2 = num1 / num2;
        
        System.out.println("El resultado sin decimales es: " + resultado2);
       
        
        resultado = (double) num1 / num2;
        
        System.out.println("El resultado con decimaes es: " + resultado);
        

    }

}
