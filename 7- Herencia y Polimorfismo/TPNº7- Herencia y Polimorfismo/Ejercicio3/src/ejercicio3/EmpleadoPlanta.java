
package ejercicio3;


public class EmpleadoPlanta extends Empleado{
    
    private double sueldoFijo ;
    public EmpleadoPlanta(String nombre , double sueldoFijo) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }
    
    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo de "+ getNombre() + " es de: $"
        +getSueldoFijo() );
        }

}
