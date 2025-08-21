/*5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, suma = 0;

        System.out.print("Ingrese un numero (0 para terminar ): ");
        numero = input.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {    //Condicion de numero par
                suma += numero;
            }

            System.out.print("Ingrese un numero (0 para terminar ): "); // se vuelven a pedir datos
            numero = input.nextInt();
        }
        
        System.out.println("La suma de numeros pares es: " + suma);

    }

}


