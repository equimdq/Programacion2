package Ejercicio05;

public class Main5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apolo I", 50);

        nave.despegar(); // Intento fallido de despegue
        nave.recargarCombustible(50); // Recarga de combustible al máximo (100 lts.)
        nave.despegar(); // Reeintento de despegue
        nave.avanzar(15); // Consume 45 (15 lts * 3 km)
        nave.mostrarEstado(); // Detalle del estado
        System.out.println(nave);
    }
}