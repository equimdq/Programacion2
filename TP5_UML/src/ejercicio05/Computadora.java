
package ejercicio05;

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;
    
    // Constructores

    public Computadora() {
    }
    // Pasamos chipset y modelo por parametro para establecer la composición
    public Computadora(String marca, String numeroSerie, Propietario propietario, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario !=null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", propietario=" + (propietario != null ? propietario.getNombre(): "Sin propietario") + ", placaMadre=" + placaMadre + '}';
    }
    
    
    
    
}
