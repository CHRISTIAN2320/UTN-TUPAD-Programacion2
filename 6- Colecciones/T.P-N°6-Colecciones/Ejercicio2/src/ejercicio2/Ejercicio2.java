
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Paramous");
        
        Autor a1 = new Autor("abc1", "Frank Herbert", "EEUU");
        Autor a2 = new Autor("fgh123", "Stephen King", "EEUU");
        Autor a3 = new Autor("jkl345", "Dan Brown", "EEUU");
        
        Libro l1 = new Libro("AGFG1239", "Origen", 2017 , a3);
        Libro l2 = new Libro("AJKLÑ123", "Dune", 1965, a1);
        Libro l3 = new Libro("QWER123", "Doctor Sueño ", 2013, a2);
        Libro l4 = new Libro("TYUUI567", "El Resplandor", 1977, a2);
        Libro l5 = new Libro("HJKL566", "El simbolo perdido", 2009, a3);
        
        b1.agregarLibros(l1);
        b1.agregarLibros(l2);
        b1.agregarLibros(l3);
        b1.agregarLibros(l4);
        b1.agregarLibros(l5);
        
        b1.listarLibros();
        System.out.println("");
        System.out.println("");
        
        System.out.println(b1.buscarLibroPorIsbn("AGFG1239"));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(b1.filtrarLibrosPorAnio(2009));

        System.out.println("");
        System.out.println("Ejercicio 7");
        b1.eliminarLibro("TYUUI567");
        b1.listarLibros();
        
        System.out.println("");
        System.out.println("Ejercicio 8");
        System.out.println("La biblioteca tiene " + b1.obtenerCantidadLibros() + " libros" );
        
        System.out.println("");
        System.out.println("Ejercicio 9");
        System.out.println("Los autores Disponibles son: \n");
        for (Autor a : b1.mostrarAutoresDisponibles()) {
            System.out.println(a + "\n");
        }
        
        
    }

}
