package ejericicio1;

public class Ejericicio1 {
    
    public static void main(String[] args) {
    //Composicion
    Pasaporte pasaporte= new Pasaporte(111222333,"24/09/2025", "dirección_imagen", "jpg");
    pasaporte.MostrarFoto(); 
    // Bidireccion
    Titular titular = new Titular("Christian ", 123456);
    pasaporte.setTitular(titular); // Establecemos la relacion
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Informacion del pasaporte : \n" +  " Numero: " + titular.getPasaporte().getNumero() 
                + " \n Fecha de emision: " + titular.getPasaporte().getFechaEmision());
    }
       
}
