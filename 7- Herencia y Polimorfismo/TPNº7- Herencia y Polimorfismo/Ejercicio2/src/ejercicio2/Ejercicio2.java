
package ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList <>();
        
        figuras.add(new Circulo(5, "circulo1"));
        figuras.add(new Rectangulo(2, 5, "rectangulo"));
        
        for (Figura figura : figuras) {
            figura.calcularArea();
        }
        
        
        
    }

}
