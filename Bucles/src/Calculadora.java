
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Por favor, ingrese un número entre 1 y 10.");
        }

    }
}
