
package ejercicio02;


public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    
    
    //Constructores
    public Usuario() {
    }

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Métodos
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular !=null && celular.getUsuario() !=this) {
            celular.setUsuario(this); // Evitamos recursividad entre celular y usuario
    }

    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    //Evitamos la recursividad de celular e imprimimos "Sin marca" en caso de que sea null
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.getMarca() : "Sin marca");
    }
    

}
    
