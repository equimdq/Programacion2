
package Ejercicio1;


public class Main1 {

    
    public static void main(String[] args) {
        
        
        Inventario inventario = new Inventario();

        //Creamos los productos
        inventario.agregarProducto(new Producto("P001", "Arroz", 850, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Notebook", 1000000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Campera", 50000, 20, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla", 20000, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Auriculares", 5000, 30, CategoriaProducto.ELECTRONICA));
        
        System.out.println("\n\n========== TAREA: Listar productos ==========\n");


        //Listamos los productos
        inventario.listarProductos();
        
        System.out.println("\n\n========== TAREA Busqueda por ID ==========\n");

        //Buscamos por ID
        Producto buscado = inventario.buscarProductoPorId("P003"); // buscamos la campera
        if (buscado != null) buscado.mostrarInfo(); //validamos que no sea null
        
        System.out.println("\n\n========== TAREA Filtrar categorías ==========\n");

        //Filtramos categorías
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA); // utilizamos el enum para filtrar por cateogría
        
        System.out.println("\n\n========== TAREA Eliminamos un producto ==========\n");

        //Eliminamos un producto
        inventario.eliminarProducto("P005"); // eliminamos los auricuales y listamos los productos
        inventario.listarProductos();
        
        System.out.println("\n\n========== TAREA Actualizamos el stock ==========\n");

        //Actualizamos stock
        inventario.actualizarStock("P001", 60);
        
        System.out.println("\n\n========== TAREA Total stock ==========\n");

        //Total stock
        System.out.println("Total en stock: " + inventario.obtenerTotalStock());
        
        System.out.println("\n\n========== TAREA Producto con mayor stock ==========\n");

        //Producto con mayor stock
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            System.out.println("Producto con mayor stock:");
            mayor.mostrarInfo();
        }
        
        System.out.println("\n\n========== TAREA filtrar por precio ==========\n");
        //Filtramos por precio
        inventario.filtrarProductosPorPrecio(25000, 500000);
        
        System.out.println("\n\n========== Categorias ==========\n");
        
        //Mostramos categorías
        inventario.mostrarCategoriasDisponibles();
    }

}
