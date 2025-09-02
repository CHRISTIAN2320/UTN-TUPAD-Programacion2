
package ejercicio2;

public class Mascota {
    String nombre = "Firulays";
    String especie = "Dogo Argentino";
    int edad = 5 ;
    
    void mostrarInfo(){
        System.out.println(nombre +" es un "+ especie +" y tiene "+ edad+ " anios" );    
    }
    
    void cumplirAnios(int anios) {
        edad+= anios;
        System.out.println("Luego de " + anios + "años, "+ nombre + " tiene ahora" + edad + " años" );
    }
    

    
}
