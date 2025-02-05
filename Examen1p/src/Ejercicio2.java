//el usuario ingrese dos palabras y el programa  indique cual es mas larga y por cuantas letras lo es

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.nextLine();


        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();

        if (longitud1 > longitud2) {
            int diferencia = longitud1 - longitud2;
            System.out.println("La primera palabra (" + palabra1 + ") es más larga por " + diferencia + " letras.");
        } else if (longitud2 > longitud1) {
            int diferencia = longitud2 - longitud1;
            System.out.println("La segunda palabra (" + palabra2 + ") es más larga por " + diferencia + " letras.");
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }

    }
}
