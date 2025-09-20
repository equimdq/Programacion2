
package ejercicio03;


public class Autor {
    
    private String nombre_autor;
    private String nacionalidad;
    
    //Constructores

    public Autor() {
    }

    public Autor(String nombre_autor, String nacionalidad) {
        this.nombre_autor = nombre_autor;
        this.nacionalidad = nacionalidad;
    }
    //Métodos
    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre_autor=" + nombre_autor + ", nacionalidad=" + nacionalidad + '}';
    }
    
    

}
