
package Ejercicio03;

public class Main3 {

    
    public static void main(String[] args) {
      Libro miLibro2 = new Libro("Rayuela", "Cortazar", 2020);
      System.out.println(miLibro2);
      
      miLibro2.setAñoPublicacion(500); // validación
      
      miLibro2.setAñoPublicacion(1963); // Año válido
    }

}
