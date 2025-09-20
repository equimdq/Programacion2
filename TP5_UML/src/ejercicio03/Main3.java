
package ejercicio03;

public class Main3 {

    
    public static void main(String[] args) {
        
        Autor autor = new Autor ("Eduardo Sacheri", "argentino");
        Editorial editorial1 = new Editorial ("Alfaguara", "San Martin 1650");
        
        Libro Libro = new Libro ("Esperandolo a Tito", "44564", autor, editorial1);
        // Libro 2 con el mismo autor y la misma editorial
        Libro Libro2 = new Libro("La noche de la usina", "44565", autor, editorial1);
        
        System.out.println(Libro);
        System.out.println(Libro2);
    }

}
