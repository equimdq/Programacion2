
package ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; //Asociación bidireccional
    
    //Constructores

    public Titular() {
    }

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuenta=" + (cuenta !=null ? cuenta.getCbu(): "Sin cuenta") + '}';
    }
    
}
