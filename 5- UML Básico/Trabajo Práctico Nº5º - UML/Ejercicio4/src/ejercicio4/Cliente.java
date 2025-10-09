
package ejercicio4;


public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito ;
    // CONSTRUCTOR
    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    public String getNombre() {
        return nombre;
    } 
}
