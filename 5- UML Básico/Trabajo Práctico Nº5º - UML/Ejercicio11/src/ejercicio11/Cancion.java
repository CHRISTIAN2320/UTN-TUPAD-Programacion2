
package ejercicio11;


public class Cancion {
    private String titulo;
    private Artista artista; // Asociacion 1:1
    private Reproductor reproductor;
    //Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public void MostrarArtista(){
        if (artista != null) {
            System.out.println("El artista de la cancion \" " + getTitulo() +"\", es " 
                    + artista.getNombre() 
                    + " y su genero es " + artista.getGenero() + "\n");
        } else {
            System.out.println("No se ha cargado un artista");
        }
    }
    public String getTitulo() {
        return titulo;
    }
}
