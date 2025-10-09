
package ejercicio8;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composicion 1:1
    private Usuario usuario; // Agregacion 1:1
    // CONSTRUCTOR 
    public Documento(String titulo, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
    }
    // CONSTRUCTOR 2
    public Documento(String titulo, Usuario usuario) {
        this.titulo = titulo;
        this.usuario = usuario;
    }
    public void FirmaDigital() {
            System.out.println("La firma digital del libro es: " + 
                    firmaDigital.getCodigoHash() + "\n y su fecha es: " + 
                    firmaDigital.getFecha() + "\n" );
    }
    public void Usuario (){
        System.out.println("El nombre del usuario es: " + usuario.getNombre() + 
                "\n y su email es: " + usuario.getEmail());
    }
    
    
    
    

}
