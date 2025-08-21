package ejercicio8;

import java.util.Scanner;

/* 8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 

Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.*/
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el porcentaje de Impuesto: ");
        double impuesto = Double.parseDouble(input.nextLine()) /100 ;
                
        System.out.println("Ingrese el porcentaje de Descuento: ");
        double descuento = Double.parseDouble(input.nextLine()) /100;

        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        System.out.println("El precio final es :" + precioFinal);
    }

    static double calcularPrecioFinal(double impuesto, double descuento) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese precio Base");
        double PrecioBase = Integer.parseInt(input.nextLine());

        double PrecioFinal = PrecioBase + (PrecioBase * impuesto) - (PrecioBase * descuento);
        return PrecioFinal;

    }

}
