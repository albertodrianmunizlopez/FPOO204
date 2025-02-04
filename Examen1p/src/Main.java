//programa de grados
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese que operacion quiere  ");
        int operador = scanner.nextInt();

        double farenhei,kelvin, centigrados;


        switch (operador){
            case 1:

                System.out.println("Ingrese la farenheis ");
                double farenheis = scanner.nextDouble();

                     centigrados = (farenheis-32) * 5/9;
                     System.out.println("La temperatura en centigrados "+centigrados);

                break;
            case 2:
                System.out.println("Ingrese la farenheis ");
                double centigrado = scanner.nextDouble();

                 farenhei = (centigrado * 9/5)+32;
                System.out.println("La temperatura en faremngei es: "+farenhei);

                break;
            case 3:
                System.out.println("Ingrese la farenheis ");
                double centigrado1 = scanner.nextDouble();

                kelvin  = centigrado1 + 273.15;
                System.out.println("La temperatura en kelvin es: "+kelvin );

                break;

            default:
                System.out.println("No hay de esa  ");

        }

    }
}