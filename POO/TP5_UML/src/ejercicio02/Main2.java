
package ejercicio02;


public class Main2 {


    public static void main(String[] args) {
        Bateria b1 = new Bateria("Samsung-b1", "8000");
        Usuario user1 = new Usuario ("Ezequiel", "31256789");
        Celular c1 = new Celular("12345", "Samsung", "GalaxyS25", user1, b1);
        
        System.out.println(c1);
        
    }

}
