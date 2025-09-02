
package ejercicio1;

/*  1. Registro de Estudiantes
        a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación
.
        Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).

        Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
*/
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Estudiante e1= new Estudiante ();
        
        e1.mostrarInfo();
        int calificacion_incrementada = e1.subirCalificacion(100);
        e1.mostrarInfo();
        int calificacion_decrementada = e1.bajarCalificacion(105);
        e1.mostrarInfo();
        
    }

}
