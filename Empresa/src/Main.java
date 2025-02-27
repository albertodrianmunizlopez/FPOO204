//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String opcionStr = JOptionPane.showInputDialog("Selecciona una opción:\n" +
                    "1. Crear Vehículo\n" +
                    "2. Crear Conductor\n" +
                    "3. Crear Envío\n" +
                    "4. Crear Entrega\n" +
                    "5. Salir");
            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:

                    Vehiculo vehiculo1 = new Vehiculo();
                    vehiculo1.mostrarInformacion();
                    break;

                case 2:

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
                    String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");

                    Conductor conductor1 = new Conductor(nombre, identificacion, licencia);
                    conductor1.mostrarInformacion();
                    break;

                case 3:

                    Envio envio = Envio.crearEnvio();

                    // Mostrar los datos del envío
                    JOptionPane.showMessageDialog(null, "Codigo de Envío: " + envio.getCodigoEnvio() +
                            "\nDestino: " + envio.getDestino() +
                            "\nPeso: " + envio.getPeso());
                    break;

                case 4:

                    String numeroGuiaStr = JOptionPane.showInputDialog("Introduce el numero de guia:");
                    int numeroGuia = Integer.parseInt(numeroGuiaStr);
                    Entrega entrega = new Entrega(numeroGuia);


                    JOptionPane.showMessageDialog(null, "Numero de Guia: " + entrega.getNumeroGuia() +
                            "\nEstado: " + entrega.getEstado());


                    entrega.actualizarEstado();

                    JOptionPane.showMessageDialog(null, "Numero de Guia: " + entrega.getNumeroGuia() +
                            "\nEstado Actualizado: " + entrega.getEstado());
                    break;

                case 5:

                    JOptionPane.showMessageDialog(null, "Saliendo");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida.");
                    break;
            }
        }

    }
}