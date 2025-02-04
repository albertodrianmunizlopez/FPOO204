//dos palabras e indique cual es mas larga y por cuantas letras lo es

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primer frase ");
        String frase1 = scanner.nextLine();

        System.out.println("Ingrese la primer frase ");
        String frase2 = scanner.nextLine();

        if(frase2 == frase1){
            System.out.println("La frase es mayor ");
        }


    }
}
