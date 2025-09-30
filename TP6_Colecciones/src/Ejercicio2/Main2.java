
package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        //Crear autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A003", "Gabriel García Márquez", "Colombia");

        //Agregar libros
        biblioteca.agregarLibro("L001", "Ficciones", 1944, a1);
        biblioteca.agregarLibro("L002", "El Aleph", 1949, a1);
        biblioteca.agregarLibro("L003", "La casa de los espíritus", 1982, a2);
        biblioteca.agregarLibro("L004", "Cien años de soledad", 1967, a3);
        biblioteca.agregarLibro("L005", "Crónica de una muerte anunciada", 1981, a3);

        //Listar libros
        System.out.println("\n Todos los libros:");
        biblioteca.listarLibros();

        //Buscar por ISBN
        System.out.println("\n Buscar libro por ISBN:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        //Filtrar por año
        System.out.println("\n Libros publicados en 1981:");
        biblioteca.filtrarLibrosPorAnio(1981);

        //Eliminar libro
        biblioteca.eliminarLibro("L002");
        System.out.println("\n️ Libros restantes tras eliminar L002:");
        biblioteca.listarLibros();

        //Cantidad total
        System.out.println("\n Total de libros: " + biblioteca.obtenerCantidadLibros());

        //Autores disponibles
        System.out.println("\n Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}

