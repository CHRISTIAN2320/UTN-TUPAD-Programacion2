package javaapplication97;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        System.out.println("--- Divisionsegura ---");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese el numerador entero: ");
            int numerador = scanner.nextInt();
            System.out.print("Ingrese el divisor entero:  ");
            int divisor = scanner.nextInt();

            int resultado = numerador / divisor;
            System.out.println("Resultado de la division: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("\n Error de calculo: ArithmeticException capturada.");
            System.err.println("Motivo: No se puede dividir por cero. El sistema continua.");

        } catch (InputMismatchException e) {
            System.err.println("\n Error de entrada: InputMismatchException capturada.");
            System.err.println("Por favor, ingrese solo numeros enteros.");

        }
        System.out.println("\n El programa ha finalizado el intento de division.");
    }
}


