package ejercicio1;


public class Estudiante {
    String nombre = "Christian"; 
    String apellido = "Olivero";
    int curso = 123;
    int calificacion = 100;
    
    void mostrarInfo() {
         System.out.println(nombre +" "+ apellido +" "+curso +" "+calificacion  );
    }
    
    int subirCalificacion (int puntos) {
        return calificacion += puntos;
 
    }
    
    int bajarCalificacion(int puntos) {
        return calificacion -= puntos;
    }
}



