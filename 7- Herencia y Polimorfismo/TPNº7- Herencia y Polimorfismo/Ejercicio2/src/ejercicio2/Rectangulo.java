package ejercicio2;

public class Rectangulo extends Figura {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: "
                + base*altura);
    }

}
