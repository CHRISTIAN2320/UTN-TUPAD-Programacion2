/*7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Ingrese una nota");
            nota = input.nextInt();
            
            if (nota > 10 || nota < 0) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                System.out.println("Nota guardada correctamente.");
            }
        } while (nota > 10 || nota < 0);

    }

}
