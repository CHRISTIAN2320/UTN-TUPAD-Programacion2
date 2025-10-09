
package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        Contribuyente C1 = new Contribuyente("Christian", 123124546);
        Impuesto I1= new Impuesto(100);
        I1.setContribuyente(C1); //establecemos la relacion
        I1.MostrarContribuyente();
        Calculadora.Calcular(I1);
    }
}
