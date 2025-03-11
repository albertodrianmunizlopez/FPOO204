import javax.swing.JOptionPane;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        String usuarioa = "kecin";
        int Contra1 = Integer.parseInt("12345");

        String usuario = JOptionPane.showInputDialog("Ingrese usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese contraseña:");
        String departamento = JOptionPane.showInputDialog("Ingrese departamento:");

        InicioSesion inicioSesion = new InicioSesion(usuario, contrasena, departamento);
        if (inicioSesion.validarCredenciales(usuario, contrasena)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");

            String[] opciones = {"Agregar Artículo", "Consultar Stock", "Solicitar Artículo", "Salir"};
            int opcion;
            do {
                opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                switch (opcion) {
                    case 0:
                        String nombreArticulo = JOptionPane.showInputDialog("Nombre del artículo:");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                        inventario.agregarArticulo(nombreArticulo, cantidad);
                        break;
                    case 1:
                        inventario.consultarStock();
                        break;
                    case 2:
                        String articuloSolicitado = JOptionPane.showInputDialog("Ingrese el artículo a solicitar:");
                        SolArt solicitud = new SolArt(usuario, articuloSolicitado);
                        solicitud.autorizarSolicitud();
                        break;
                }
            } while (opcion != 3);
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intente de nuevo.");
        }

    }
}