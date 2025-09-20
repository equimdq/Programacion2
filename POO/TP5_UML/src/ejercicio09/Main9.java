
package ejercicio09;

public class Main9 {

    public static void main(String[] args) {
        Paciente p1 = new Paciente ("Ezequiel Ventura", "Medicus");
        Profesional prof1 = new Profesional ("Jose Gonzalez", "Clínica médica");
        CitaMedica CM1 = new CitaMedica ("25/03/2026", "17hs", p1, prof1);
        
        System.out.println(CM1);
    }

}
    