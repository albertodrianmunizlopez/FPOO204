
import java.util.Scanner;

public class Arbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del árbol ");
        int base = scanner.nextInt();

        int altura = base / 2 + 1;
        int espacios = altura - 1;
        int asteriscos = 1;

        while (asteriscos <= base) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();

            espacios--;
            asteriscos += 2;
        }

    }
}
