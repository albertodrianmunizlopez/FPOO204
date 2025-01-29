
import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.printf("La letra '%c' aparece %d veces en la frase '%s'.%n", letra, contador, frase);

    }
}
