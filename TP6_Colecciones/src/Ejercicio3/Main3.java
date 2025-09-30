
package Ejercicio3;


public class Main3 {

    
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        
        Profesor p1 = new Profesor("P001", "Luis Gonzalez", "Matemática");
        Profesor p2 = new Profesor("P002", "Marcos Sanguinetti", "Informática");
        Profesor p3 = new Profesor("P003", "Micaela Salazar", "Física");

        
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación");
        Curso c3 = new Curso("C103", "Física I");
        Curso c4 = new Curso("C104", "Estadística");
        Curso c5 = new Curso("C105", "Bases de Datos");

        
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P002");

        
        System.out.println("\n Cursos:");
        uni.listarCursos();
        System.out.println("\n Profesores:");
        uni.listarProfesores();

        
        System.out.println("\n Cambio de profesor en C104:");
        uni.asignarProfesorACurso("C104", "P003");

        
        System.out.println("\n️ Eliminando curso C102:");
        uni.eliminarCurso("C102");
        uni.listarProfesores();

        
        System.out.println("\n️ Eliminando profesor P001:");
        uni.eliminarProfesor("P001");
        uni.listarCursos();

        
        System.out.println("\n Reporte de cursos por profesor:");
        uni.mostrarReporteCursosPorProfesor();
    }

}
