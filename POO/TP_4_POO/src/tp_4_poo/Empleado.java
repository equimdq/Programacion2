package tp_4_poo;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int contadorID = 1;
    private static int totalEmpleados = 0;

    // Constructor principal con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;

        // Sincroniza el contador automático si el ID manual es mayor para validar que no se repitan
        if (id >= contadorID) {
            contadorID = id + 1;
        }
    }

    // Constructor sobrecargado: asigna ID automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this(contadorID++, nombre, puesto, 1000);
    }

    // Constructor sobrecargado: asigna ID automático y salario personalizado
    public Empleado(String nombre, String puesto, double salario) {
        this(contadorID++, nombre, puesto, salario);
    }
    
    // Métodos sobrecargados
    
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public void actualizarSalario(int aumento) {
        this.salario += aumento;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + salario + "}";
    }
}
