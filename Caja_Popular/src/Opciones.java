import javax.swing.*;

public class Opciones {

    private String titular;
    private int edad;
    private double saldo = 0;
    private String noCuenta;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public Opciones(int edad, String noCuenta, double saldo, String titular) {
        this.edad = edad;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

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
