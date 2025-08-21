/*11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.*/

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    static final double ENTRADA_SALIDA = 0.20;  //10%
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int precio ;
        double precioFinal;
        
        System.out.print("Ingrese Precio del Producto");
        precio= input.nextInt();
        
        calcularDescuentoEspecial(precio);
        
    }
    
    static void calcularDescuentoEspecial (double precio) {
        double descuentoAplicado;
        descuentoAplicado= precio - precio * ENTRADA_SALIDA;
        
        System.out.println("El descuento especial aplicado es: %"+ (ENTRADA_SALIDA*100));
        System.out.println("El precio final con descuento es: " + descuentoAplicado); 
    }
}
