/*4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
            Categoría A: 10% de descuento
            Categoría B: 15% de descuento
            Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    final static double DESC_A = 0.10;
    final static double DESC_B = 0.15;
    final static double DESC_C = 0.20;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int precio;
        char categoria;
        double descuento = 0, precioFinal = 0;

        System.out.print("Ingrese precio del producto:");
        precio = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese Categoria (A,B,C):");
        categoria = input.nextLine().charAt(0);

        if (categoria == 'A' || categoria == 'a') {
            descuento = DESC_A;
            precioFinal = precio - (precio * descuento);
        } else if (categoria == 'B' || categoria == 'b') {
            descuento = DESC_B;
            precioFinal = precio - (precio * descuento);
        } else if (categoria == 'C' || categoria == 'c') {
            descuento = DESC_C;
            precioFinal = precio - (precio * descuento);
        }

        System.out.println("El precio del producto es: $" + precio + 
                " el descuento aplicado es del %" + (descuento * 100) + 
                " y el precio final es: $" + precioFinal);

    }

}
