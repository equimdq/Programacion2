
package ejercicio05;

public class Main5 {
    public static void main(String[] args) {
        
        Propietario propietario = new Propietario("Ezequiel", "31252392");
        
        //Creamos la computadora, pasando los datos de la placa madre y el propietario
        Computadora computadora = new Computadora("Asus", "SN9654", propietario, "A530", "AMD");

        //Establecemos la relación bidireccional
        propietario.setComputadora(computadora);

        System.out.println(computadora);
        System.out.println(propietario);
    }
}

