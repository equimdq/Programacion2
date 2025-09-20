
package ejercicio01;


public class Main1 {

    
    public static void main(String[] args) {
        Pasaporte p1 = new Pasaporte("A2345878", "04/11/2024", "foto1.jpg", "jpg");
        Titular t1 = new Titular("Ezequiel", "31256892");
        p1.setTitular(t1);
        
        System.out.println(p1);
        System.out.println(t1);
    }

}
