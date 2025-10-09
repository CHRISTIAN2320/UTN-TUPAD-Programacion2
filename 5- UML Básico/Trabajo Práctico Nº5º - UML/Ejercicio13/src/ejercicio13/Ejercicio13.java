
package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Christian", "qwerty@gmail.com");
        CodigoQR codigo = new CodigoQR("Codigo 1 ");
        codigo.setUsuario(usuario);// Establecemos relacion
        codigo.MostrarUsuario();
        System.out.println(codigo.getValor());
        Usuario usuario2= new Usuario("Emmanuel", "asdfklj@gmail");
        Generador.generar("Codigo2", usuario2);
        
    }

}
