
package ejercicio3;

public class Libro {
    private String titulo = "La Divina Comedia ";
    private String autor = "Dante Alighieri" ;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >  0 ) {
        this.anioPublicacion = anioPublicacion;    
        }
    }
    
    
    
    

    
}
