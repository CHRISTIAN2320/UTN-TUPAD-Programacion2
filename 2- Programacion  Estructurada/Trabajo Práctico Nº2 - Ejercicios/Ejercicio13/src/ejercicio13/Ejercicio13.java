
package ejercicio13;

/*13. Impresión recursiva de arrays antes y después de modificar un elemento.
    Crea un programa que:
        a. Declare e inicialice un array con los precios de algunos productos.
        b. Use una función recursiva para mostrar los precios originales.
        c. Modifique el precio de un producto específico.
        d. Use otra función recursiva para mostrar los valores modificados.*/
public class Ejercicio13 {

    public static void main(String[] args) {
        double[] numeros = {199.99, 299.5, 149.75, 399, 89.99};

        System.out.println("Recorrido del array:");
        recorrerArray(numeros, 0);  // empezamos desde el índice 0
        
        // MODIFICAMOS
        numeros [3]= 129.99;
        // Mostramos el array madificado
        System.out.println("Recorrido del array modificado:");
        recorrerArray(numeros, 0);
    }
     
// Función recursiva
    static void recorrerArray(double [] arr, int indice) {
        // Caso base: si ya llegamos al final, se corta la recursión
        if (indice == arr.length) {
            return;
        }

        // Acción: mostrar el elemento actual
        System.out.println("Elemento en posición " + indice + ": " + arr[indice]);

        // Llamada recursiva para el siguiente elemento
        recorrerArray(arr, indice + 1);
    }

}
