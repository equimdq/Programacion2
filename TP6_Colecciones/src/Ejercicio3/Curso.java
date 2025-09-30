
package Ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor nuevoProfesor) {
    if (this.profesor != null && this.profesor != nuevoProfesor) {
        Profesor anterior = this.profesor;
        this.profesor = null; // Rompe la referencia antes de eliminar
        anterior.getCursos().remove(this); // Elimina sin llamar a eliminarCurso()
    }

    this.profesor = nuevoProfesor;

    if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
        nuevoProfesor.getCursos().add(this); // Agrega sin llamar a agregarCurso()
    }
    
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("-----------------------------");
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
}
