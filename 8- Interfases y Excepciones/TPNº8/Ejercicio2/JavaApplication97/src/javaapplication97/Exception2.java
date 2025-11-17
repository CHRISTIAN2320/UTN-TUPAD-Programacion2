package javaapplication97;

import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        System.out.println("--- Conversion ---");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena de texto para convertirla a numero: ");
            String cadena = scanner.nextLine();

            int numero = Integer.parseInt(cadena);

            System.out.println("La conversion fue exitosa. Numero resultante: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("\n ERROR DE CONVERSION: NumberFormatException capturada.");
            System.err.println("La cadena ingresada no representa un numero entero valido.");
            }
        System.out.println("\n El sistema ha finalizado la conversion.");
    }
}
        
