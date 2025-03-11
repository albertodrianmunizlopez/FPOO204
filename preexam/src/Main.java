import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        while (true) {
            String opcionStr = JOptionPane.showInputDialog("Selecciona una opción:\n" +
                    "1. Ingrese su cliente\n" +
                    "2: Que desa ordenar \n" +
                    "3: Pago");
            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    Cliente Cliente1 = new Cliente("Juan", "Vazquez", 10);
                    Cliente1.mostrarinfo();
                    break;
                case 2:
                    Orden orden1 = new Orden(100, 5);
                    orden1.Mostrarinfo();

                    break;
                case 3:
                    Pago pago1 = new Pago(50);
                    JOptionPane.showInputDialog("El pago es de " + pago1);


                    break;
                default:
                    JOptionPane.showInputDialog("No hay de esa");
            }


        }
    }
}
