
package ejercicio1;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Estado Actual de los empleados: "+ Empleado.mostrarTotalEmpleados());
        System.out.println("");
        Empleado e1 = new Empleado(1111, "Chrisitian", "Programador", 1200);
        Empleado e2 = new Empleado("Emmanuel", "Analista de datos");
        
        System.out.println("Empleados Creados"); 
        System.out.println(e1);  //Forma Estandar de 4 paramatros
        System.out.println(e2); // Forma Sobrecarga , con 2 param.
        System.out.println("");
        // Salarios
        System.out.println("Mostrar Salarios");
        System.out.println("Salario 1: " + e1.getSalario());
        System.out.println("Salario 2: " + e2.getSalario());
        
        e1.actualizarSalario(100);  // Aumentar cantidad Fija
        e2.actulizarSalario(10);    // Aumentar con porcentaje
        
        System.out.println("");
        System.out.println("Mostrar Salarios Actualizados");
        System.out.println("Salario 1: " + e1.getSalario());
        System.out.println("Salario 2: " + e2.getSalario());
        
        System.out.println("");
        // Mostrar Empleados
        System.out.println("Estado actual de los empleados: " + Empleado.mostrarTotalEmpleados());
    }
    

}
