
package ejercicio06;

public class Main6 {

    
    public static void main(String[] args) {
        Cliente C1 = new Cliente("Ezequiel", "223-4567890");
        Mesa M1 = new Mesa("1", 4);
        Reserva R1 = new Reserva("25/09/2025", "21hs", C1, M1);
        
        System.out.println(R1);
        
    }

}
