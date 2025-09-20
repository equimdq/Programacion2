
package ejercicio04;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito; // asosiación bidireccional

    //Constructores
    
    public Cliente() {
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito !=null && tarjetaDeCredito.getCliente() !=this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + (tarjetaDeCredito !=null ? tarjetaDeCredito.getNumero(): "Sin Tarjeta") + '}';
    }

}
