
package ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Composicion CuentaBancaria -> ClaveSeguridad
       CuentaBancaria Cuenta1 = new CuentaBancaria(250000453, 400, "ABC_123", "28/09/2025");
       Cuenta1.MostrarClaveSeguridad();
       // Bidireccional CuentaBancaria -> Titular 
       Titular titular1 = new Titular("Christian", 4026531);
       Cuenta1.setTitular(titular1); //Establecemos la relacion Bidireccional
       System.out.println("Cuenta Bancaria : " + Cuenta1.getTitular());
       System.out.println("Titular : " + Cuenta1.getTitular().getNombre());
       System.out.println("Cuenta asociada a " + titular1.getNombre() + "\n"); 
        
    }

}
