package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    
    //Programa Principal

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        if (nuevoStock != -1) {
            System.out.println("El nuevo stock del producto es: " + nuevoStock);
        }
    }
    // Función
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
       
        if (stockActual < 0 || cantidadVendida < 0 || cantidadRecibida < 0) {
            System.out.println("Error: todos los valores deben ser números enteros positivos.");
            return -1; //
        }
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}

