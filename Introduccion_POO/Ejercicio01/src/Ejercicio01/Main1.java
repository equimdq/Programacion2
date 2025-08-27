
package Ejercicio01;


public class Main1 {

    
    public static void main(String[] args) {
        
        
        Estudiante estudiante1 = new Estudiante("Jose", "Manna", "Programación I", 7.2);

        //Mostrar información inicializada
        estudiante1.mostrarInfo();

        //Subir calificación
        estudiante1.subirCalificacion(2.5);
        estudiante1.mostrarInfo();

        //Bajar calificación
        estudiante1.bajarCalificacion(1);
        estudiante1.mostrarInfo();
    
    }

}
