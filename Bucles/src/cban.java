
import java.util.Scanner;

public class cban {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Escriba la bitácora de operaciones (D para depósito, R para retiro).");
        System.out.println("Introduzca una línea vacía para finalizar:");

        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) break;

            char operacion = linea.charAt(0);
            int monto = Integer.parseInt(linea.substring(2));

            if (operacion == 'D') {
                saldo += monto;
            } else if (operacion == 'R') {
                saldo -= monto;
            }
        }

        System.out.println("Saldo final: " + saldo);
    }
}
