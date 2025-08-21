package ejercicio10;

import java.util.Scanner;

/*10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.*/
public class Ejercicio10 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in) ;    
            int stockActual, cantidadVendida, cantidadRecibida, stockAtualizado;
            
            System.out.println("Ingrese Stock Actual: ");
            stockActual = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese cantidad Vendida: ");
            cantidadVendida = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese Cantidad Recibida: ");
            cantidadRecibida = Integer.parseInt(input.nextLine());
            
            stockAtualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            
            System.out.println("El stock Actualizado es: " + stockAtualizado);

    }

    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int NuevoStock = stockActual - cantidadVendida + cantidadRecibida;

        return NuevoStock;
    }

}
