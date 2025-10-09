
package ejercicio2;


public class Usuario {
    private String nombre ;
    private int dni;
    public Celular celular; 
    //CONSTRUCTOR
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
   public Celular getCelular() {
        return celular;
    }
    public String getUsuario() {
        return nombre;
    }
    // REFERENCIA DE CELULAR
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario()!= this) {
            celular.setUsuario(this);    
        } 
    }
    public String getNombre() {
        return nombre;
    }
}
