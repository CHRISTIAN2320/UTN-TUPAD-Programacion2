
package ejercicio4;


public class Ejercicio4 {
    public static void main(String[] args) {
        // AGREGACION
        Banco banco = new Banco("Galicia", 789456); 
        TarjetaDeCredito tarjeta= new TarjetaDeCredito(123456, "29/09/2027", banco);
        System.out.println("El banco de la tarjeta es: " + tarjeta.getBanco().getNombre() + "\n");
        // ASOC. BIDIRECCIONAL:
        Cliente cliente = new Cliente("Christian", 123456);
        tarjeta.setCliente(cliente);
        System.out.println("El propietario de la tarjeta es: " + tarjeta.getCliente().getNombre() +"\n");
        System.out.println("Los datos de la tarjeta son: "+ "\nNumero:" + cliente.getTarjetaDeCredito().getNumero()
        + "\nFecha de vencimiento: " + cliente.getTarjetaDeCredito().getFechaVencimiento());
    }

}
