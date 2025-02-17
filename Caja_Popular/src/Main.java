//Consultar saldo, ingresar efectivo, retirar efectivo, depositar a otra cuenta
//cuenta registrada los siguientes datos no.cuenta, titular,edad,saldo

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

            Opciones cuenta1 = new Opciones("123", "Juan Perez", 30, 1000.0);
            Opciones cuenta2 = new Opciones("456", "Maria Gomez", 25, 500.0);

            String[] opciones = {"Consultar saldo", "Ingresar Efectivo", "Retirar Efectivo", "Depositar a otra cuenta", "Salir"};
            while (true) {
                String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (opcion == null || opcion.equals("Salir")) {
                    break;
                }

                switch (opcion) {
                    case "Consultar saldo":
                        cuenta1.consultarSaldo();
                        break;
                    case "Ingresar Efectivo":
                        double cantidadIngresar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar:"));
                        cuenta1.ingresarEfectivo(cantidadIngresar);
                        break;
                    case "Retirar Efectivo":
                        double cantidadRetirar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                        cuenta1.retirarEfectivo(cantidadRetirar);
                        break;
                    case "Depositar a otra cuenta":
                        double cantidadDepositar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                        cuenta1.depositarOtraCuenta(cuenta2, cantidadDepositar);
                        break;
                }
            }



    }
}