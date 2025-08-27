
package ejercicio02;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    //Constructor
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Métodos

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + '}';
    }
    
    public void cumplirAnios(int anios) {
        this.edad += anios;
        
        System.out.println("Se incrementó la edad en " + anios + " año(s).");
        
        
    }
    
    
    
}
