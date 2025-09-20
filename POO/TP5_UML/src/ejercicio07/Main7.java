
package ejercicio07;

public class Main7 {

    
    public static void main(String[] args) {
        Conductor C1 = new Conductor ("Ezequiel", "A12345");
        Motor M1 = new Motor ("Nafta", "ABC-0923478");
        Vehiculo V1 = new Vehiculo("AF345FJ", "308", M1);
        
        C1.setVehiculo(V1);
        System.out.println(V1);
    }

}
