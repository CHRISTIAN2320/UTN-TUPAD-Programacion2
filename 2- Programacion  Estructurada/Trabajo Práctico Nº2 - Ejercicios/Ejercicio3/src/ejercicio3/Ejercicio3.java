/*3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor"*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su Edad: ");
        edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else if (edad < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto Mayor");
        }

    }

}
