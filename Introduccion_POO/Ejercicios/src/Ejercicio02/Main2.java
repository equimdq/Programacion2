
package ejercicio02;


public class Main2 {

    
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Patan", "Perro", 3);
        System.out.println(mascota1); 
        mascota1.cumplirAnios(1); // edad a sumar
        System.out.println(mascota1); //muestra la edad incrementada
        
    }

}
