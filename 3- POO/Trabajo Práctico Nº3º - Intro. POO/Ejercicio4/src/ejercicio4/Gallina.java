
package ejercicio4;

public class Gallina {
    int idGallina ;
    int edad;
    int huevosPuestos;
    
    void ponerHuevo (int cantidad){
        huevosPuestos += cantidad;
    }
    
    void envejecer (int años){
        edad+=años;
    }
    
    void mostrarEstado(){
        System.out.println("El id de la gallina es: "+ idGallina + ", la edad de la gallina es " + edad + " años, y ha puesto " + huevosPuestos + " huevos");
    }
}
