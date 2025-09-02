package ejercicio5;


public class NaveEspacial {
     String nombre;
     int combustible;
     
     void despegar(){
       if (combustible != 0)  {
          System.out.println("Puede despegar");
       }
     } 
             
     void avanzar(int distancia){
         if (combustible >= distancia) {
             System.out.println("Puede Avanzar");
             combustible -= distancia;
         } else {
             System.out.println("No puede Avanzar porque no hay suficiente combustible");
         }
         
     }
     
     void recargarCombustible(int cantidad){
         combustible+=cantidad;
     }
             
     void mostrarEstado(){
         System.out.println("El estado de la nave es: \n"
                 + "Nombre: "+nombre+ "\n Combustible: " + combustible );
     }
}
