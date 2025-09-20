
package ejercicio03;


public class Editorial {
    private String nombre_editorial;
    private String direccion;

    public Editorial() {
    }

    public Editorial(String nombre_editorial, String direccion) {
        this.nombre_editorial = nombre_editorial;
        this.direccion = direccion;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre_editorial=" + nombre_editorial + ", direccion=" + direccion + '}';
    }
    
    

}
