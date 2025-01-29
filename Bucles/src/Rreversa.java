
import java.util.Scanner;

public class Rreversa{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero : ");
    int numero = sc.nextInt();

    System.out.println("Numeros desde el 1  : "+numero );
    for(int i=numero ; i>=0; i--){
        if(i<numero){
            System.out.println(", ");
        }
        System.out.print(i);
    }

    }
}
