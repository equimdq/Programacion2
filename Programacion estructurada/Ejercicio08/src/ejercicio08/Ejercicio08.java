package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, desc, precioFinal;
        int imp;

        System.out.println("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el impuesto en porcentaje: ");
        imp = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el descuento en porcentaje: ");
        desc = Double.parseDouble(input.nextLine());

        // Llamada al método
        precioFinal = calcularPrecioFinal(precioBase, imp, desc);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoAplicado = precioBase * (impuesto / 100);
        double descuentoAplicado = precioBase * (descuento / 100);
        return precioBase + impuestoAplicado - descuentoAplicado;
    }
}

