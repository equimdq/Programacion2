
package ejercicio04;


public class Main4 {

    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ezequiel", "30546782");
        Banco B1 = new Banco("Nación", "30-232354322-9");
        TarjetaDeCredito TC1 = new TarjetaDeCredito("4555666633211514", "03/28", B1);
        
        // vinculo cliente con tarjeta
        TC1.setCliente(cliente1);
        
        System.out.println(TC1);
        System.out.println(cliente1);
        
        
    }

}