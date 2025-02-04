//el usuario ingrese dos palabras y el programa  indique cual es mas larga y por cuantas letras lo es

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primer frase ");
        String frase1 = scanner.next().strip();

        System.out.println("Ingrese la primer frase ");
        String frase2 = scanner.next().strip();

        int contador =0;

        for (int i = 0; i < frase1.length(); i++) {
            for (int j = 0; i < frase2.length(); i++) {
                if (frase1.strip() == frase2.strip()) {
                    contador++;

                }
            }
        }
        System.out.printf("La letra mas pequeña es '%s'.%n", frase1, contador, frase2);

        for (int i = 0; i < frase2.length(); i++) {
            for (int j = 0; i < frase1.length(); i++) {
                if (frase1.strip() == frase2.strip()) {
                    contador++;

                }
            }
        }
        System.out.printf("La letra mas pequeña es '%s'.%n", frase2, contador, frase1);
    }
}
