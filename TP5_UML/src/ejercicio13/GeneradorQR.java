
package ejercicio13;

public class GeneradorQR {
    
    public CodigoQR generarQR(String valor, Usuario usuario) {
        
        CodigoQR codigo = new CodigoQR(valor, usuario);
        return codigo;
    }
    
    
}
