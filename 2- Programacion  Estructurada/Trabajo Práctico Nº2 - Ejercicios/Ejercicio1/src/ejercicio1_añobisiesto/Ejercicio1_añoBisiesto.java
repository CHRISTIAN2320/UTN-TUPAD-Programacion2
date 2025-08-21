/*Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.*/

package ejercicio1_añobisiesto;

import java.util.Scanner;

public class Ejercicio1_añoBisiesto {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int año;
        
        System.out.print("Ingrese el Año: ");
        año=input.nextInt();
        if (año % 4 == 0 &&(año % 100 != 0 || año % 400 == 0)) {
                System.out.println("El año " + año + " es Bisiesto");
           
        } else {
    
                System.out.println("El año " + año + " No es Bisiesto");
        }
        
    }

}
