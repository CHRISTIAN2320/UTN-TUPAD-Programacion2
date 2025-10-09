
package ejercicio7;

public class Vehiculo {
    private String tipo;
    private String numeroSerie ;
    private Conductor conductor; //Asoc Bidireccional
    private Motor motor; // Agregacion
    // CONSTRUCTOR
    public Vehiculo(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    // 2º Constructor (Agregacion)
    public Vehiculo(String tipo, String numeroSerie, Motor motor) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.motor = motor;
    }
    //Relacion 
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this ) {
            conductor.setVehiculo(this);
        }
    }
    public Conductor getConductor() {
        return conductor;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void getMotor() {
        System.out.println("El vehiculo tipo:" + getTipo() +" numero de serie: "+ 
                getNumeroSerie() +" tiene un motor: " + motor.getTipo() + " y un numero de serie: "+ 
                motor.getNumeroSerie());
    }
    public String getTipo() {
        return tipo;
    }
   @Override
    public String toString() {
        return "{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + ", conductor=" + conductor.getNombre() + '}';
    }
}
