
package ejercicio02;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    
    //Constructores
    public Celular() {
    }

    public Celular(String imei, String marca, String modelo, Usuario usuario, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.bateria = bateria;
    }
    
    //Métodos
    public String getImei() {
        return imei;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() !=this) { //validamos que no se llamen recursivamente usuario y celular
            usuario.setCelular(this); 
        }
    }
    
    // Evitamos la recurisvidad de usuario al imprimir con tooString
    @Override
    public String toString() {
        return "Celular: " + marca + ", Modelo: " + modelo + ", Usuario: " + (usuario != null ? usuario.getNombre() + "(" + usuario.getDni() + ")": "Sin usuario"); 
}

    
}
