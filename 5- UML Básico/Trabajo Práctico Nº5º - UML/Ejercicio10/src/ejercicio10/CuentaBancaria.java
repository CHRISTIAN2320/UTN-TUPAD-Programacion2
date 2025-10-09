
package ejercicio10;


public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad claveseguridad; // Composicion 1:1
    private Titular titular; // Rel. Bidireccional 1:1
    // Constructor
    public CuentaBancaria(int cbu, double saldo, String codigo, String ultimaModificaion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveseguridad = new ClaveSeguridad(codigo, ultimaModificaion);
    }
    public void MostrarClaveSeguridad(){
        System.out.println("La clave de seguridad es: "+ claveseguridad.getCodigo() 
                + " y su ultima modificacion es: " + claveseguridad.getUltimaModificacion() + "\n");
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null &&  titular.getCuentabancaria() != this ) {
            titular.setCuentabancaria(this);
        }
    }
    public Titular getTitular() {
        return titular;
    } 
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + '}';
    }
}
