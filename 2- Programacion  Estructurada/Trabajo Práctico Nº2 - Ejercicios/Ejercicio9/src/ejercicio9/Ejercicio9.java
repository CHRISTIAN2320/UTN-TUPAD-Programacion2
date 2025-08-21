/* 9. Composición de funciones para calcular costo de envío y total de compra.

        a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.

        Nacional: $5 por kg
        Internacional: $10 por kg

        b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.

Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar. */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoDelPaquete;
        String zonaEnvio;
        double PrecioPrdoducto;
        double costoEnvio ;
        double Total;
        
        System.out.println("Ingrese el peso del paquete: ");
        pesoDelPaquete = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingese Zona de Envío (Nacional o Internacional):");
        zonaEnvio = input.nextLine();
        
        System.out.println("Ingrese Precio del Producto: ");
        PrecioPrdoducto = Double.parseDouble(input.nextLine());
        
        costoEnvio = calcularCostoEnvio(pesoDelPaquete, zonaEnvio);
        Total = calcularTotalCompra(PrecioPrdoducto, costoEnvio);
        
        System.out.println("El costo de envio es : "+ costoEnvio);
        System.out.println("EL TOTAL DE LA COMPRA ES : " + Total);
        
             
        
      
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        double CostoEnvio;
        if (zona.equals("Nacional") ) {
            CostoEnvio= 5 * peso;
        } else {                    // Caso para internacional
            CostoEnvio = 10 * peso;  
        }
        
        return CostoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        double TotalCompra= costoEnvio +  precioProducto;
    
        return TotalCompra;
    }

}
