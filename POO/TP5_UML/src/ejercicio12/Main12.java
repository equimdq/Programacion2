
package ejercicio12;

public class Main12 {

    public static void main(String[] args) {
        Contribuyente C1 = new Contribuyente("Ezequiel", "23456789129");
        Impuesto I1 = new Impuesto(6450.0, C1);
        
        Calculadora calculadora1 = new Calculadora();
        
        calculadora1.calcular(I1);
    }

}
