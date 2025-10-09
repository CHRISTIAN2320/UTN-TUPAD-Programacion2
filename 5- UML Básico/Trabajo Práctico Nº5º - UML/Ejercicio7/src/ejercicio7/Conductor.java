
package ejercicio7;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // R. Bidireccional
    // CONSTRUCTOR
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    // Relacion
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this ) {
            vehiculo.setConductor(this);  
        }
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public String getNombre() {
        return nombre;
    }
     @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", licencia=" + licencia +", vehiculo=" + 
                vehiculo.getNumeroSerie() + '}';
    }  
}
