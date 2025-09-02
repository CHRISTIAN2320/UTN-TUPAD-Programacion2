
package ejercicio2;

/*  2. Registro de Mascotas
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.

 */
public class Ejercicio2 {

  
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        
        m1.mostrarInfo();
        m1.cumplirAnios(5);
        
    }

}
