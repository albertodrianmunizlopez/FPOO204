import javax.swing.*;

public class Opciones {

    String titular;
    int edad;
    double saldo = 0;
    String noCuenta;

    public Opciones(String noCuenta, String titular, int edad, double saldo) {
        String cuentaNoCuenta = noCuenta;
        String cuentaTitular = titular;
        edad = edad;
        double cuentaSaldo = saldo;

    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void ingresarEfectivo(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Has ingresado: " + cantidad + ". Saldo actual: " + saldo);
    }

    public void retirarEfectivo(double cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            System.out.println("Has retirado: " + cantidad + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositarOtraCuenta(Opciones otraCuenta, double cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            otraCuenta.saldo = saldo + cantidad;
            System.out.println("Has depositado: " + cantidad + " a la cuenta de " + otraCuenta.titular);
            System.out.println("Tu saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");


        }
    }
}
