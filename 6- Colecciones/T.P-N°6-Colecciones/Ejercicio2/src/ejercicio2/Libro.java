package ejercicio2;

public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("La informacion del libro es: "
                + "\nIsbn: " + getIsbn()
                + "\nTitulo: " + getTitulo()
                + "\nAnio de Publicacion: " + getAnioPublicacion());
    }

    @Override
    public String toString() {
        return "Libro{" + "\nisbn=" + isbn + ", \ntitulo=" + titulo + ", \nanioPublicacion=" + anioPublicacion + ", \n" + autor + '}';
    }

}
