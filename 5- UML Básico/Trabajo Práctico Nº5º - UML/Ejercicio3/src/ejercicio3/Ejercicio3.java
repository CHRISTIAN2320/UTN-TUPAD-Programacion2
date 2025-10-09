
package ejercicio3;


public class Ejercicio3 {

    public static void main(String[] args) {
        //Agregacion
        Editorial editorial = new Editorial("Planeta", "Av.Siempre viva");
        Libro libro = new Libro("DUNE", "ABC123", editorial);
        System.out.println("La editorial del libro es: " + libro.getEditorial().getNombre());
        //Asociacion
        Autor autor = new Autor("Frank Herbert", "EEUU");
        libro.setAutor(autor);
        System.out.println("El autor del libro es " + libro.getAutor().getNombre() 
                + " de nacionalidad " + libro.getAutor().getNacionalidad()); 
    }

}
