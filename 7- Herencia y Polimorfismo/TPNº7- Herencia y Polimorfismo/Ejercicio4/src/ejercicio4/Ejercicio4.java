
package ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulays", 3));
        animales.add(new Gato("Michi", 1));
        animales.add(new Vaca("Lola", 2));
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-----------------------");
        }
        
    }

}
