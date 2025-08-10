/* 5.   Escribe un programa que solicite dos números enteros y realice las siguientes
        operaciones:
            a. Suma
            b. Resta
            c. Multiplicación
            d. División
        Muestra los resultados en la consola.*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese num1: ");
        num1=input.nextInt();
        System.out.print("Ingrese num2: ");
        num2=input.nextInt();
        
        System.out.println("La suma de los numeros es: " + (num1+num2));
        System.out.println("La resta de los numeros es: " + (num1-num2));
        System.out.println("La multiplicacion de los numeros es: " + (num1*num2));
        System.out.println("La division de los numeros es: " + ((double)num1/num2));
        
    }

}
