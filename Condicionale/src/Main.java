//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
Programa 1
        String contrasena = "SHola123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String contrasenaUsuario = scanner.nextLine();

        if (contrasena.equalsIgnoreCase(contrasenaUsuario)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
*/
/*                Programa 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número : ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

 */
/*     Programa 3
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce la edad del cliente: ");
        int edad = scanner.nextInt();

        int precio;
        if (edad < 4) {
            precio = 0;
        } else if (edad <= 18) {
            precio = 110;
        } else {
            precio = 190;
        }

        if (precio == 0) {
            System.out.println("La entrada es gratis.");
        } else {
            System.out.println("El precio de la entrada es: $" + precio);
        }
*/

/*
            Scanner scanner = new Scanner(System.in);


            System.out.print("Introduce una cadena: ");
            String cadena = scanner.nextLine();


            String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();


            if (esPalindromo(cadenaLimpia)) {
                System.out.println("La cadena es un palíndromo.");
            } else {
                System.out.println("La cadena NO es un palíndromo.");
            }

        }

        public static boolean esPalindromo(String str) {
            int inicio = 0;
            int fin = str.length() - 1;

            while (inicio < fin) {
                if (str.charAt(inicio) != str.charAt(fin)) {
                    return false;
                }
                inicio++;
                fin--;
            }
            return true;

 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Introduce un operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                break;
        }
    }
}