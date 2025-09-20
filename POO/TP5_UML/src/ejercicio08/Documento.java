
package ejercicio08;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaD; //Composición

    public Documento() {
    }

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaD = new FirmaDigital(codigoHash, fecha, usuario); //Creación de usuario
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaD() {
        return firmaD;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaD=" + firmaD + '}';
    }

    
}
