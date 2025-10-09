
package ejercicio2;


public class Ejercicio2 {

    public static void main(String[] args) {
        // Agregacion
        Bateria bateria = new Bateria("AA55", "6000mA");
        Celular celular = new Celular("ABC_123", "Samsung", "A54", bateria);
        celular.MostrarBateria();
        // Bidireccionalidad
        Usuario usuario = new Usuario("Christian", 40123456);
        celular.setUsuario(usuario);
        System.out.println("El dueño del celuar es: " + celular.getUsuario().getNombre());
        System.out.println("Los datos datos del celular son: \n" +
                " Marca: " + usuario.getCelular().getMarca() 
                + "\n Modelo: " +usuario.getCelular().getModelo() );
    }
}
