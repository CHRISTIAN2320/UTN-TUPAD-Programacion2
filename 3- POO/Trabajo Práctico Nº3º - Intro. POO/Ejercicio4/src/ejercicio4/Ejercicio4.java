
package ejercicio4;

/*      4. Gestión de Gallinas en Granja Digital
     a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
    Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
    Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        //Creamos las dos gallinas
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        // Estado inicial:
        g1.idGallina = 0001;
        g1.edad= 1;
        g1.huevosPuestos=20;
        
        g2.idGallina = 0002;
        g2.edad= 2;
        g2.huevosPuestos=30;
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        // Con el tiempo
        g1.ponerHuevo(50);
        g1.envejecer(3);
        
        g2.ponerHuevo(10);
        g2.envejecer(3);
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        
    }

}
