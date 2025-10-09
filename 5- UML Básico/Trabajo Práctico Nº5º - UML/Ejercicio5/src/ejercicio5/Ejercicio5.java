
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Composicion
        Computadora computadora = new Computadora("ASUS", 123456, "Zenbook Duo", "r9");
        System.out.println("El chipset de la computadora es: " + computadora.getPlacaMadre().getChipset() 
        + " y su modelo es " + computadora.getPlacaMadre().getModelo());
        // Asoc. Bidireccional
        Usuario usuario = new Usuario("Christian", 40123456);
        computadora.setUsuario(usuario);
        System.out.println("El propietario de la computadora es "+ computadora.getUsuario().getNombre());
        System.out.println("Los datos de la computadora son: \nMarca: " + usuario.getComputadora().getMarca()
        + "\nNumero de Serie: " + usuario.getComputadora().getNumeroSerie());
    }
}
