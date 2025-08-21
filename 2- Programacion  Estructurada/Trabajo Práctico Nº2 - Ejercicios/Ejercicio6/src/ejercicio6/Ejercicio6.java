/*6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, contPositivo = 0, contNegativo = 0, contCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un Numero: ");
            numero = input.nextInt();

            if (numero > 0) {
                contPositivo++;
            } else if (numero < 0) {
                contNegativo++;
            } else {
                contCeros++;
            }
        }
        
        System.out.println(" Positivos: " + contPositivo );
        System.out.println(" Negativos: " + contNegativo );
        System.out.println(" Ceros: " + contCeros );

    }

}
