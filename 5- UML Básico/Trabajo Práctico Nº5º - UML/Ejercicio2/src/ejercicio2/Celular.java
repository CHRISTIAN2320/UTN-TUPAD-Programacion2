package ejercicio2;

public class Celular {

    private String imei;
    private String marca;
    private String modelo; 
    private Bateria bateria; // AGREGACION 1:1
    public Usuario usuario; // rel Bidireccional
    //CONSTRUCTOR
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria= bateria;
    }
    // REFERENCIA DE USUARIO
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    public String getModelo() {
        return modelo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void MostrarBateria(){
        System.out.println("La bateria que tiene el celular es " + bateria.getModelo() 
                + " y tiene una capacidad de " + bateria.getCapacidad() + "\n" );
    }
    public String getMarca() {
        return marca;
    }
    
}
