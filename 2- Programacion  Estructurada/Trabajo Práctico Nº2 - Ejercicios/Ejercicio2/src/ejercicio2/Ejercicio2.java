/*2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  num1, num2, num3 ;
        int MAXIMO=0;
        
        System.out.print("Ingrese el Número 1: ");
        num1=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el Número 2: ");
        num2=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el Número 3: ");
        num3=Integer.parseInt(input.nextLine());
        
        if (num1>MAXIMO) 
            MAXIMO=num1;
        if (num2>MAXIMO) 
            MAXIMO=num2;
        if (num3>MAXIMO) 
            MAXIMO=num3;
        System.out.println("El mayor numero es: " + MAXIMO );
        
    }

}
