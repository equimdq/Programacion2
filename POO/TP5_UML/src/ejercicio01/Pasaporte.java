
package ejercicio01;


public class Pasaporte {
    private String numero;
    private String fecha_emision;
    private Foto foto;
    private Titular titular;
    
    
    // Constructor

    public Pasaporte() {
    }

    public Pasaporte(String numero, String fecha_emision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fecha_emision = fecha_emision;
        this.foto = new Foto(imagenFoto, formatoFoto); //Bidireccionalidad: el titular también conoce su pasaporte
    }
    // Get y Set
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() !=this) {
        titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return foto + (titular != null ? titular.getNombre() + " (" + titular.getDni() + ")" : "Sin titular") + '}' + "Pasaporte{" + "numero=" + numero + ", fecha_emision=" + fecha_emision + ", foto=";
    }
        
    
    

}
