
package ejercicio14;

public class Main14 {

    public static void main(String[] args) {
        Proyecto P1 = new Proyecto("Documental: George Boole", 60);
        EditorVideo editor = new EditorVideo();
        
        Render render1 = new Render(".mp4", P1);
        
        System.out.println("Render generado: " + render1.getFormato() + " para el proyecto " + render1.getProyecto().getNombre());
    }

}
