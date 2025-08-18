
package funciones1;

import java.util.Scanner;


public class Funciones1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int num;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese un número entero: ");
        num = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + num);
    }

}

