

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*

        Scanner sc = new Scanner(System.in);


        System.out.printf("Ingrese las horas que trabajo: ");
        Double horas = sc.nextDouble();

        System.out.printf("¿Cuanto gana? : ");
        Double pago = sc.nextDouble();

        Double Total = horas * pago;

        System.out.printf("Su pago es de : " + Total);

 */
/*
        Scanner sc = new Scanner(System.in);

        String ape, apem, nombre;

        System.out.println("Ingrese su apellido paterno");
        ape = sc.nextLine();

        System.out.println("Ingrese su apellido materno");
        apem = sc.nextLine();

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        String apepMinusculas= ape.toLowerCase();
        String apemMinusculas= apem.toLowerCase();
        String nomMinusculas= nombre.toLowerCase();

        String apepMayusculas= ape.toUpperCase();
        String apemMayusculas= apem.toUpperCase();
        String nomMayusculas = nombre.toUpperCase();

        String apepNormal= ape.toUpperCase().charAt(0)+"";
        String apemNormal= apem.toUpperCase().charAt(0)+"";
        String nomNormal= nombre.toUpperCase().charAt(0)+"";

        System.out.println(apepMinusculas  +  apemMinusculas  +   nomMinusculas);
        System.out.println(apepMayusculas  +  apemMayusculas  +   nomMayusculas);
        System.out.println(apepNormal+  apemNormal+   nomNormal);
*/
/*
  Scanner sc = new Scanner(System.in);

        int x;
        double suma=0;

        System.out.print("Ingrese un numero : ");
        x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese el numero: "+i +"\n");
            int y = sc.nextInt();

        }
        suma = suma + x;

        System.out.println("La suma es: "+suma);
*/
/*

        Scanner sc = new Scanner(System.in);

        int payaso= 112;
        int muñecas = 75;
        int paletas,mune, totalpayaso, totalmuñecas, total, peso;

        System.out.println("Ingrese la cantidad de payasos que lleva la caja: ");
        paletas = sc.nextInt();

        System.out.println("Ingrese la cantidad de muñecas que lleva la caja: ");
        mune = sc.nextInt();

        totalpayaso = payaso*paletas;
        totalmuñecas= muñecas*mune;
        total = paletas+mune;
        peso = totalpayaso+totalmuñecas;

        System.out.println("Peso total de peso en los payasos es: " +totalpayaso + "g");
        System.out.println("Peso en las muñecas es: " +totalmuñecas + "g");
        System.out.println("El total de productos que lleva la caja es: " +total);
        System.out.println("El peso total del paquete es de: " + peso);
*/
/*
        Scanner sc = new Scanner(System.in);

        String frace;

        System.out.print("Introdusca la frase : ");
        frace = sc.nextLine();

        StringBuilder frase = new StringBuilder(frace);
        System.out.println("(" + frase + ") = " + frase.reverse());
*/

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();


        String nombreMayusculas = nombre.toUpperCase();


        int numeroLetras = nombre.replace(" ", "").length();


        System.out.println(nombreMayusculas + " tiene " + numeroLetras + " letras.");
    }
}