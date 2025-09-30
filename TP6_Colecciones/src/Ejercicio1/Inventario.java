
package Ejercicio1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public Inventario() {
        this.productos =  new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto p : productos ) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
    for (Producto p : productos) {
        if (p.getId().equals(id)) {
            return p;
        }
    }
    return null; // si no existe
    }
    
    public void eliminarProducto(String id) {
    Producto encontrado = buscarProductoPorId(id);
    if (encontrado != null) {
        productos.remove(encontrado);
        System.out.println("Producto eliminado: " + encontrado.getNombre());
        } else {
        System.out.println("No se encontró un producto con ID: " + id);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
    Producto encontrado = buscarProductoPorId(id);
    if (encontrado != null) {
        encontrado.setCantidad(nuevaCantidad);
        System.out.println("Stock actualizado para " + encontrado.getNombre() + ": " + nuevaCantidad);
        } else {
        System.out.println("No se encontró un producto con ID: " + id);
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }

}
