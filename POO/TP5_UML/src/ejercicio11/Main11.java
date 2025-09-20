
package ejercicio11;

public class Main11 {

    public static void main(String[] args) {
       Artista a1 = new Artista("La renga", "Rock");
       Cancion c1 = new Cancion("Ruta 40", a1);
       
       Reproductor reproductor = new Reproductor();
       
       reproductor.reproducir(c1);
    }

}
