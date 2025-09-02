
package ejercicio5;

/*          5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
        Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
        Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
        Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/
public class Ejercicio5 {

   
    public static void main(String[] args) {
       NaveEspacial n1 = new NaveEspacial();
        n1.nombre="Nostradamus";
        n1.combustible=50;
       // DESPEGUE
       n1.despegar();
       // Avanzar 
       n1.avanzar(60);
       // Recargar
       n1.recargarCombustible(30);
       // Avanzar
       n1.avanzar(60);
       // Estado Final
       n1.mostrarEstado();
        
    }

}
