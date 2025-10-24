package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Carlos", 250000));
        empleados.add(new EmpleadoTemporal("Juan", 8, 25000));

        for (Empleado empleado : empleados) {
            empleado.calcularSueldo();
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }

    }

}
