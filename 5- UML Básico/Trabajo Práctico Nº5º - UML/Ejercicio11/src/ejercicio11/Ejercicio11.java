
package ejercicio11;

public class Ejercicio11 {  
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Ich tu dir weh");
        Artista artista1= new Artista("Rammstein", "Metal industrial");
        cancion1.setArtista(artista1); //Establecemos la relación 
        cancion1.MostrarArtista();
        Reproductor.Reproducir(cancion1); // Reproducimios la cancion
    }
}
