
package ejercicio1;

public class Empleado {

   private int id;                      // Identificador único del empleado.
   private String nombre;               // Nombre completo.
   private String puesto;               // Cargo que desempeña.
   private double salario;              // Salario actual.
   private static int totalEmpleados=0;   // Contador global de empleados creados.

  //CONSTRUCTOR 
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados ++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    //SOBRECARGA DE CONSTRUCTOR

    public Empleado(String nombre, String puesto) {
        totalEmpleados ++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        this.id = 1234;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    // METODOS y SOBRECARGAS
    
    public double actualizarSalario ( double cantidadAumentar){
        return salario += cantidadAumentar;
    }
    
    public double actulizarSalario (double porcentajeAumento ){
        return salario+= porcentajeAumento*salario/100;
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
   
}
