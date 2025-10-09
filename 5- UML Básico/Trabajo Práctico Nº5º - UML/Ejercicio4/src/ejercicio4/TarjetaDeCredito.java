
package ejercicio4;


public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento; 
    private Banco banco; // AGREGACION 1:1
    private Cliente cliente ; // ASOC. BIDIRECCIONAL 1:1
    //Constructor
    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    // ASOCIACION 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito()!= this ) {
            cliente.setTarjetaDeCredito(this);    
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Banco getBanco() {
        return banco;
    }
    public int getNumero() {
        return numero;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}
