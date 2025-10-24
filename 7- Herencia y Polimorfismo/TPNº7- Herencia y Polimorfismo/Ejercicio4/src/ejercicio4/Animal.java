package ejercicio4;

public abstract class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void hacerSonido();

    public void describirAnimal() {
        System.out.println("el nombre del animal es "
                + getNombre() + " y tiene " + getEdad() + " anios");
    }

}
