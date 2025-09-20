package ejercicio10;

public class Main10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Ezequiel Ventura", "31256892");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456", 138401.55, "UtN025", "16/09/2025");

        cuenta.setTitular(titular); //

        System.out.println(cuenta);
        System.out.println(titular);
    }
}
