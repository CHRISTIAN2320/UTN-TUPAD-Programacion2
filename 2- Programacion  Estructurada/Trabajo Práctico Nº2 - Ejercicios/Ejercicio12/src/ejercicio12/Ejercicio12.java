
package ejercicio12;

/*12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.*/
public class Ejercicio12 {

    
    public static void main(String[] args) {
        double [] Precios= {99.99 , 299.5, 149.75, 399.0, 89.99 };
            System.out.println("Vector Original:");
        for (int i = 0; i < Precios.length; i++) {
            System.out.print(" "+ Precios[i]);  
            
        }
        System.out.println("");
        Precios[2]=129.99;
            System.out.println("Vector modificado:");
        for (int i = 0; i < Precios.length; i++) {
            System.out.print(" " + Precios[i]);
        }
        System.out.println("");
        
    }

}
