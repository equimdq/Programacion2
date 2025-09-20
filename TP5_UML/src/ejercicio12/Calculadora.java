
package ejercicio12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        System.out.println("El impuesto a pagar es de $" + impuesto.getMonto() + " para el contribuyente: " + impuesto.getContribuyente().getNombre() + " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
        
    }

}
