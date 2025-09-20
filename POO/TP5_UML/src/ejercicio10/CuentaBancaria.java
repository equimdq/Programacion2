
package ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; //Composición
    private Titular titular; // Asociación bidireccional
    
    //Constructores

    public CuentaBancaria() {
    }

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
    }
    //Métodos

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular !=null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + (titular != null ? titular.getNombre(): "Sin nombre") + '}';
    }
    
    

}
