
package ejercicio6;


public class Cliente {
    private String nombre; 
    private int telefono;
    //private Reserva reserva;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\nnombre=" + nombre + 
                " , \ntelefono=" + telefono + '}';
    }
}
