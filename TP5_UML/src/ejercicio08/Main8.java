
package ejercicio08;

public class Main8 {

    
    public static void main(String[] args) {
        Usuario user1 = new Usuario ("Ezequiel", "eze@eze.com");
        FirmaDigital FD1 = new FirmaDigital ("E345345345A22", "16/09/2025", user1);
        Documento doc1 = new Documento("Escritura", "Escritura de compraventa...", "E345345345A22", "16/09/2025", user1);
        
        System.out.println(doc1);
        
    }

}
