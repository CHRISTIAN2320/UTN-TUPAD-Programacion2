
package ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociacion 
    // Constructor
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void MostrarUsuario (){
        if (usuario != null) {
            System.out.println("El usuario asociado es " + usuario.getNombre());
        } else {
            System.out.println("No se ha cargado un usuario");
        }
    }
    @Override
    public String toString() {
        return " CodigoQR : {" + "valor=" + valor + '}';
    }    
}
