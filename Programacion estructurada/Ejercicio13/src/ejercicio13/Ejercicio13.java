package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {

        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        precios[3] = 386.99;

        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }
    // Función recursiva
    public static void imprimirPreciosRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirPreciosRecursivo(array, indice + 1);
        }
    }
}
