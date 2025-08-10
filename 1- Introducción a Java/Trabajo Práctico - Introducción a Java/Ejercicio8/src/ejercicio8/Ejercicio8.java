/**     8. Manejar conversiones de tipo y división en Java.
            a. Escribe un programa que divida dos números enteros ingresados por el
            usuario.
            b. Modifica el código para usar double en lugar de int y compara los
            resultados. */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese num1: ");
        num1=input.nextInt();
        System.out.print("Ingrese num2: ");
        num2=input.nextInt();
        
        System.out.println("La division de los numeros sin double es: " + (num1/num2));
        System.out.println("La division de los numeros es: " + ((double)num1/num2));
        
    }

}
