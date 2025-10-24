
package ejercicio3;


public class EmpleadoTemporal extends Empleado{ 
    private double horasTrabajadas ;
    private double valorHora;
    
    public EmpleadoTemporal(String nombre, double horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas= horasTrabajadas;
        this.valorHora=valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo de "+ getNombre() + " es de: $"
        + getValorHora()*getHorasTrabajadas());
     }

}
