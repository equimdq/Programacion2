package tp_4_poo;



    public class MainEmpleado {

    public static void main(String[] args) {
        
        // Empleados creados con el constructor principal
        Empleado e1 = new Empleado(1, "María Gallardo", "Analista", 1550);
        // Asignamos ID5 para validar el funcionamiento del ID automático
        Empleado e2 = new Empleado(5, "Luis González", "Arquitecto de redes", 1200);

        // Empleados creados con constructor sobrecargado (ID automático)
        Empleado e3 = new Empleado("Ana Miranda", "Soporte Técnico");
        Empleado e4 = new Empleado("Carlos Armoa", "IT", 1000);
        Empleado e5 = new Empleado("Valeria Ochoa", "Diseñadora", 1500);

        // Aplicar aumentos
        e1.actualizarSalario(10.0); // Usamos un valor decimal (double) para invocar el método que aplica aumento porcentual
        e2.actualizarSalario(300);  // Método fijo
        e3.actualizarSalario(15.0);
        e4.actualizarSalario(200);
        e5.actualizarSalario(20.0);

        // Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
