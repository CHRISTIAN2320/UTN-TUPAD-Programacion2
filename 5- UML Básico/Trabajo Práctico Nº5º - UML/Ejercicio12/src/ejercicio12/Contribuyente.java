
package ejercicio12;

public class Contribuyente {
    private String nombre;
    private int cuil;
    //Constructor
    public Contribuyente(String nombre, int cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCuil() {
        return cuil;
    }
}
