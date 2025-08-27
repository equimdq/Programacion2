
package Ejercicio03;

public class Libro {
   
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // Constructor
    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 868 && añoPublicacion <= 2025) {
        this.añoPublicacion = añoPublicacion;
        }   else {
            System.out.println("El año de publicación debe ser posterior al 868.");
        }
    // Metodo
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
    }
    
    
}
