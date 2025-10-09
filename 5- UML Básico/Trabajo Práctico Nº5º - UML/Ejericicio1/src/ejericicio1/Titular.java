package ejericicio1;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; //Rel. Bidireccional
    //Constructor
    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular()!= this) {
            pasaporte.setTitular(this);
        }
    }
    public Pasaporte getPasaporte() {
        return pasaporte;
    }     
}



