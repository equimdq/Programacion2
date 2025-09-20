
package ejercicio13;

public class Main13 {

    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("eze", "eze@eze.com");
        GeneradorQR nuevQR = new GeneradorQR();
        
        CodigoQR QR1 = new CodigoQR("www.generador.qr", user1);
        
        System.out.println("QR generador para " + QR1.getUsuario().getNombre() + ", con valor: " + QR1.getValor());
        
    }

}
