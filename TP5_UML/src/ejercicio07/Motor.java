
package ejercicio07;

public class Motor {
    private String tipo;
    private String numeroSerie;
    
    //Constructores
    
    public Motor() {
    }

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
        
    //Métodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
 
}