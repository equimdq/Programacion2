
package ejercicio01;


public class Foto {
    private String imagen;
    private String formato;
    
    //Constructor

    public Foto() {
    }
    

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;   
    }
    
    // Getter and Setter
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

}
