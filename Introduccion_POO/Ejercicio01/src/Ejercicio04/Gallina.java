
package Ejercicio04;


public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constructor
    
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.edad = edad;
        this.idGallina = idGallina;
        this.huevosPuestos = huevosPuestos;
    }
        
    // Metodo
    public void ponerHuevo() {
        huevosPuestos ++; // incrementa los huevos puestos
        System.out.println("La gallina " + idGallina + " puso " + huevosPuestos + " huevo/s.");
    }

    public void envejecer() {
        edad ++; // incrementa la edad
        System.out.println("La edad de la gallina " + idGallina +" es " + edad + " año/s");
    }

    @Override
    public String toString() {
        return "Gallina{" + "idGallina=" + idGallina + ", edad=" + edad + ", huevosPuestos=" + huevosPuestos + '}';
    }
    
    

}
