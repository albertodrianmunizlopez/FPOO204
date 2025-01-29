
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            for (int j = i; j > 0; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
