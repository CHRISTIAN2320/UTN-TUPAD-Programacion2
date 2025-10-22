package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Producto p1 = new Producto("ABC123", "MiniPimer", 87500, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("FGH456", "Parlante", 350000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("QWR789", "Remera", 50000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("TYU369", "Sillon", 180000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("JIL426", "Harina", 700, 250, CategoriaProducto.ALIMENTOS);

        Inventario inventario1 = new Inventario();

        inventario1.agregarProducto(p1);
        inventario1.agregarProducto(p2);
        inventario1.agregarProducto(p3);
        inventario1.agregarProducto(p4);
        inventario1.agregarProducto(p5);

        inventario1.listarProducto();

        System.out.println("\n EL producto Buscado por id es: \n"
                + inventario1.buscarProductoPorId("abc123") + "\n");

        System.out.println("La categoria Mostrada es");
        for (Producto p : inventario1.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            System.out.println(p);
        }
        System.out.println("");
        inventario1.eliminarProducto("QWR789");
        inventario1.listarProducto();
        System.out.println("");

        inventario1.actualizarStock("jil426", 600);
        inventario1.listarProducto();

        int StockDisponibleid = inventario1.obtenerTotalStock("abc123");
        System.out.println("\nEl Stock diponible es Para el producto id abc123 es: "
                + StockDisponibleid + "\n");

        System.out.println(inventario1.obtenerProductoConMayorStock());

        System.out.println("\nProductos con precios entre $100 y $300000:");
        for (Producto p : inventario1.filtrarProductosPorPrecio(100, 300000)) {
            System.out.println(p);
        }

        System.out.println("\nCategorias Disponibles:");
        System.out.println(inventario1.mostrarCategoriasDisponibles());

    }

}
