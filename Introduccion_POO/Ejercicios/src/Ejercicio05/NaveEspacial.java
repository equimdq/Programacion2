package Ejercicio05;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean enVuelo;
    private boolean fueRecargada; // validación de recarga antes de despegue
    private final int CAPACIDAD_MAXIMA = 100;
    
    // Constructor

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.enVuelo = false;
        this.fueRecargada = false;

    }
    
    // Métodos

    public void despegar() {
        if (!fueRecargada) {
        System.out.println("La nave no puede despegar: debe recargar combustible antes.");
        return;
    }

        if (combustible >= 10) {
        combustible -= 10;
        enVuelo = true;
        System.out.println(nombre + " ha despegado.");
    }       else {
        System.out.println("Combustible insuficiente para despegar.");
    }
}



    public void avanzar(int distancia) {
        int consumo = distancia * 3; // reglaje de consumo de combustible por KMs. recorridos
        if (!enVuelo) { //validamos que no esté en vuelo
            System.out.println("La nave no ha despegado todavía.");
            return;
        } // validamos que tenga combustible suficiente para poder avanzar
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " KM.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
    if (combustible + cantidad <= CAPACIDAD_MAXIMA) {
        combustible += cantidad;
        fueRecargada = true; 
        System.out.println("Se recargaron " + cantidad + " litros. Combustible actual: " + combustible + " litros.");
    } else {
        combustible = CAPACIDAD_MAXIMA;
        fueRecargada = true;
        System.out.println("Se llenó el tanque al máximo (" + CAPACIDAD_MAXIMA + ").");
    }
}


    public void mostrarEstado() {
    System.out.println("\nESTADO DE LA NAVE");
    System.out.println("------------------");
    System.out.println("Nave: " + nombre);
    System.out.println("Combustible: " + combustible);
    System.out.println("¿En vuelo?: " + (enVuelo ? "Sí" : "No"));
}

    // Usamos tooString para simplificar
    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", combustible=" + combustible +
                ", enVuelo=" + enVuelo +
                '}';
    }
}

