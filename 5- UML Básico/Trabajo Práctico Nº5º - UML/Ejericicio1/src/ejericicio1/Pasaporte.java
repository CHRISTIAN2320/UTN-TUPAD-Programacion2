package ejericicio1;

public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto ;   // composicion
    private Titular titular; // Bidirecional
    //CONSTRUCTOR
    public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    public void MostrarFoto (){
        System.out.println("La imagen del pasaporte es: " + foto.getImagen() +
                " y el formato es " + foto.getFormato() + "\n");
    }
    //Establecemos la relacion Bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte()!= this) {
            titular.setPasaporte(this);
        }
    }
    public Titular getTitular() {
        return titular;
    }
    public int getNumero() {
        return numero;
    }
    public String getFechaEmision() {
        return fechaEmision;
    }
}
