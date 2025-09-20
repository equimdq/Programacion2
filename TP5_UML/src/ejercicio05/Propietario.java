
package ejercicio05;

public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora;
    
    // Constructores

    public Propietario() {
    }

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + (computadora != null ? computadora.getNumeroSerie(): "sin número de serie") + '}';
    }
    
    
    
}
