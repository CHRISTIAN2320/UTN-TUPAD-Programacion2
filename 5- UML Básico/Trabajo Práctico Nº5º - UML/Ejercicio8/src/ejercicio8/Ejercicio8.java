
package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        // COMPOSICION:     
        Documento Documento1 = new Documento("Programacio II", "ABC_567", "27/09/2025");
        Documento1.FirmaDigital();
        // AGREGACION
        Usuario U1 = new Usuario("Christian", "Christian@gmail.com");
        Documento Documento2= new Documento("Lbro 2", U1);
        Documento2.Usuario();
    }
}
