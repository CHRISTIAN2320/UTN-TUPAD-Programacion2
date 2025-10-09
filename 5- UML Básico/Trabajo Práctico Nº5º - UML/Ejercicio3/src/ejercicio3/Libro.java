package ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial; // ASOCIACION DE AGREGACION 1:1
    private Autor autor; // ASOCIACION UNIDIRECCIONAL 1:1
    //Constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void MostrarAutor (){
        System.out.println("El nombre del autor es:" + autor.getNombre());
    }
    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }
    
}
