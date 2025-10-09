
package ejercicio5;


public class Computadora {
    private String marca; 
    private int numeroSerie;
    private Usuario usuario; //Rel BIDIRECCIONAL 1:1
    private PlacaMadre placaMadre;  // COMPOSICION
    //CONSTRUCTOR
    public Computadora(String marca, int numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    // RELACION
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getComputadora()!=this) {
            usuario.setComputadora(this);
        } 
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    public String getMarca() {
        return marca;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
}
