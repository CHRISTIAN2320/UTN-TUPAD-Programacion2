
package ejercicio7;
public class Ejercicio7 {
    public static void main(String[] args) {
       // Instancia R. Bidireccional VEHÍCULO - CONDUCTOR
       Vehiculo v1 = new Vehiculo("auto", "ABC123");
       Conductor c1 = new Conductor("Christian", "AB_autos");
       v1.setConductor(c1); // Establecer la relación bidireccional 
       // Mostrar el estado de cada objeto
       System.out.println("Vehiculo -> " + v1);
       System.out.println("Conductor -> " + c1 + "\n");
       // Verificar consistencia: cada uno conoce al otro
       System.out.println("Conductor del vehiculo: " + v1.getConductor().getNombre());
       System.out.println("Vehiculo del conductor: " + c1.getVehiculo().getNumeroSerie() + "\n");
       
       // Instancia R. Agregacion VEHICULO - MOTOR
       Motor m1 = new Motor("1.8", "JKL_987");
       Vehiculo v2= new Vehiculo("Camioneta", "FGH_456", m1);
       v2.getMotor();
    }
}
