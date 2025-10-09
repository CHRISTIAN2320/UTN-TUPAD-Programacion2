
package ejercicio10;


public class Titular {
    private String nombre;
    private int dni ;
    private CuentaBancaria cuentabancaria;
    // Constructor 
    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setCuentabancaria(CuentaBancaria cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
        if (cuentabancaria != null && cuentabancaria.getTitular() != this ) {
            cuentabancaria.setTitular(this);     
        }
    }
    public CuentaBancaria getCuentabancaria() {
        return cuentabancaria;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
