
package ejercicio13;
public class Generador {
    public static void generar (String valor , Usuario usuario ) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        codigo.MostrarUsuario();
        System.out.println(codigo.getValor());
    }

    
}
