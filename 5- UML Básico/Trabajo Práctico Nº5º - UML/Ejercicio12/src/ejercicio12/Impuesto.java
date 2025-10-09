
package ejercicio12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociacion 1:1
    // Cosntructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    public void MostrarContribuyente (){
        if (contribuyente != null) {
            System.out.println("El contribuyente es: " + contribuyente.getNombre()
            +" y su cuil es: " + contribuyente.getCuil());
        } else {
            System.out.println("No se ha cargago contribuyente");
        }
    }
    public double getMonto() {
        return monto;
    }
}
