
package ejercicio3;

/*3. Encapsulamiento con la Clase Libro
        a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
*/
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Libro l1 = new Libro();
        
        l1.setAnioPublicacion(-1932);  // Carga de año invalido
        
        System.out.println(" Titulo: " +l1.getTitulo()+ "\n Autor:" +l1.getAutor() + "\n Anio:" + l1.getAnioPublicacion() );
        
        l1.setAnioPublicacion(1308); 
        
        System.out.println(" Titulo: " +l1.getTitulo()+ "\n Autor:" +l1.getAutor() + "\n Anio:" + l1.getAnioPublicacion() );
    }

}
