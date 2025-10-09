
package ejercicio6;
public class Ejercicio6 {
    public static void main(String[] args) {
        // Instancia de la clase Reserva - Cliente : Rel. Unidireccional
        Cliente c1 = new Cliente("Christian", 264123456);
        Reserva r1 = new Reserva("26/09/2025", "12:00");
        r1.setCliente(c1); // relacionamos ambas clases 
        System.out.println(r1);
        
        // Instancia Clase  Reserva - Mesa : Agregación
        System.out.println("");
        Mesa m1 = new Mesa(10, 4);
        Reserva r2= new Reserva("26/09/2025", "14:00", m1);
        r2.getMesa(); // Utilizamos la relación
    }
}
