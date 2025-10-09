
package ejercicio5;


public class Usuario {
    private String nombre;
    private int dni; 
    private Computadora computadora; // Rel. BIDIRECCIONAL
    //Constructor
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // Relacion 
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getUsuario() != this) {
            computadora.setUsuario(this);
        }
    }
    public Computadora getComputadora() {
        return computadora;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
}
