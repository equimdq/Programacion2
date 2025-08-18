package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 números enteros");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el siguiente número: ");
            num = Integer.parseInt(input.nextLine());

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        // mostrar resultados fuera del for
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
    


