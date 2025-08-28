
package Ejercicio04;

public class Main4 {

    
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 0, 0); // En este caso incilizamos los valores de edad y huevos en 0
        Gallina g2 = new Gallina(2, 3, 5); // En este caso los inicializamos en 3 y 5 respectivamente
        
        //Incrementos de edad y huevos para la primera gallina
        
        g1.envejecer(); 
        g1.ponerHuevo(); 
        g1.ponerHuevo();
        
        //Incrementos de edad y huevos para la segunda gallina
        
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();

    }

}
