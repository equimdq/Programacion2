package ejercicio08;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; //Agregación
    
    //Constructores

    public FirmaDigital() {
    }

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    //Métodos
    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{hash=" + codigoHash + ", fecha=" + fecha +
               ", usuario=" + (usuario != null ? usuario : "Sin usuario") + "}";
    }
}
