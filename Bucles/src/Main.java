
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = sc.nextInt();

        System.out.println("Numeros desde el 1  : " + numero);

        for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0) {
                if (i > 1) {
                    System.out.println(",");
                }
                System.out.print(i);
            }
        }
    }
}