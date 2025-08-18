
package prácticas;

import java.util.Scanner;

public class practicas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
    
        System.out.print("Ingresa un número positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0) {
            
            if (num % 2 != 0); {
            num --;
        }
            for (int cont = num; cont >= 0; cont -= 2) {
                System.out.println(cont + "");
                    
              
        }
            System.out.println("");
        } else {
            System.out.println("El número debía ser positivo");
        }
        

    }

}
