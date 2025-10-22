package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibros(Libro libros) {
        this.libros.add(libros);

    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
            System.out.println("----------");
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (isbn.equalsIgnoreCase(libro.getIsbn())) {
                return libro;
            }
        }
        return null;
    }

    public Libro filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(libro -> isbn.equalsIgnoreCase(libro.getIsbn()));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

     //Para evitar duplicados, lo ideal es usar un Set (como HashSet), que no permite elementos repetidos:
    public ArrayList<Autor> mostrarAutoresDisponibles() { 
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            if (libro.getAutor() != null) {
                autoresUnicos.add(libro.getAutor());
            }
        }
        return new ArrayList<>(autoresUnicos);
    }
    
}
