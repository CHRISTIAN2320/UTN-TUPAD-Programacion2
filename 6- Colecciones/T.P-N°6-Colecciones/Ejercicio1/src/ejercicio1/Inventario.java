package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    private ArrayList<Producto> productos;

    //Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public void listarProducto() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (id.equalsIgnoreCase(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (id.equals(p.getId())) {
                it.remove();
            }
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (id.equalsIgnoreCase(p.getId())) {
                p.setCantidad(nuevaCantidad); // 
            }
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> instPorCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                instPorCategoria.add(producto);
            }
        }
        return instPorCategoria;
    }

    public int obtenerTotalStock(String id) {
        int total = 0;
        for (Producto producto : productos) {
            if (producto.getId().equalsIgnoreCase(id)) {
                total += producto.getCantidad();
            }
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto prod = productos.get(0); // asumimos el primero como el mayor al inicio
        for (Producto producto : productos) {
            if (producto.getCantidad() > prod.getCantidad()) {
                prod = producto;
            }
        }
        return prod;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> FiltroProducto = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() > min && producto.getPrecio() < max) {

                FiltroProducto.add(producto);
            }
        }
        return FiltroProducto;
    }

    public ArrayList<CategoriaProducto> mostrarCategoriasDisponibles() {
        ArrayList<CategoriaProducto> categoriasDisponibles = new ArrayList<>();
        for (Producto producto : productos) {
            CategoriaProducto cat = producto.getCategoria();
            if (cat != null && !categoriasDisponibles.contains(cat)) {
                categoriasDisponibles.add(cat);
            }
        }
        return categoriasDisponibles;
    }
}
