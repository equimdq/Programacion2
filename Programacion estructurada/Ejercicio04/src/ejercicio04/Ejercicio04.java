
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String categoria;
        Double precioFinal,precio;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la categoria (A, B, C): ");
        categoria = input.nextLine();
        
        
        double descuento = 0;
         
        switch (categoria) {
            case "A" -> {descuento = 10;
            }
            case "B" -> {descuento = 15;
            }
            case "C" -> {descuento = 20;
            }
            default -> System.out.println("Categoría inválida");
            
            } precioFinal = precio - (precio * descuento / 100);
            
            System.out.println("Precio original: " + precio);
            System.out.println("Categoria del producto: " + categoria);
            System.out.println("Descuento aplicado: " + descuento + "%");
            System.out.println("Precio final: " + precioFinal);
        } 
                    }
            
            
        
