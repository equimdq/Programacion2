
package ejercicio14;

public class EditorVideo {
    
    public Render exportar(String formato, Proyecto proyecto) {
        Render render1 = new Render(formato, proyecto);
        System.out.println("Exportando proyecto " + proyecto.getNombre() + " en formato" + formato + " con duración de: " + proyecto.getDuracionMin());
        return render1;
    }
}
