/*  4.  Escribe un programa que solicite al usuario ingresar su nombre y edad, y           luego los muestre en pantalla. Usa Scanner para capturar los datos.*/

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su Nombre: ");
        nombre=input.nextLine();
        
        System.out.print("Ingrese su edad:");
        edad=input.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y su edad es de: " + edad + " años");
        
        
       
    }

}
