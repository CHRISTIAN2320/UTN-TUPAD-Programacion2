
package ejercicio6;


public class Reserva {
    private String fecha;
    private String hora ;
    private Cliente cliente;  // Asociacion 1:1
    private Mesa mesa; // Agregacion  
    // Constructor
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;    
    }
    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }
    public void getMesa() {
            System.out.println("La Reserva de la fecha " + getFecha() + 
                    "; hora: " + getHora() + " tiene una mesa numero " + mesa.getNumero() +
                    " de una capacidad de " + mesa.getCapacidad() + " personas");
    }
    @Override
    public String toString() {
        return "Reserva{" + 
                "\nfecha=" + fecha + 
                ", \nhora=" + hora + 
                ", \n" + cliente + '}';
    }
    
    
    

    
    
    
    
}
