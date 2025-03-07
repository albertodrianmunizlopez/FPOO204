import javax.swing.*;

public class Main {

        private static Empleado[] empleados = new Empleado[100];
        private static int indice = 0;

        public static void main(String[] args) {
            while (true) {
                int opcion = mostrarMenuPrincipal();

                switch (opcion) {
                    case 0:
                        agregarEmpleado();
                        break;
                    case 1:
                        listarEmpleados();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


        private static int mostrarMenuPrincipal() {
            return JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Agregar Empleado", "Listar Empleados", "Salir"}, "Agregar Empleado");
        }


        private static void agregarEmpleado() {
            int tipoEmpleado = mostrarMenuTipoEmpleado();

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
            int id = obtenerEntero("Ingrese el ID del empleado");
            double salario = obtenerDouble("Ingrese el salario del empleado");

            switch (tipoEmpleado) {
                case 0:
                    agregarConductor(nombre, id, salario);
                    break;
                case 1:
                    agregarAdministrativo(nombre, id, salario);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        private static int mostrarMenuTipoEmpleado() {
            return JOptionPane.showOptionDialog(null, "¿Qué tipo de empleado deseas agregar?", "Tipo de Empleado",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conductor", "Administrativo"}, "Conductor");
        }


        private static void agregarConductor(String nombre, int id, double salario) {
            String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor");
            empleados[indice] = new Conductor(nombre, id, salario, licencia);
            indice++;
            JOptionPane.showMessageDialog(null, "Conductor agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }

        // Administrativo
        private static void agregarAdministrativo(String nombre, int id, double salario) {
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo");
            empleados[indice] = new Administrativo(nombre, id, salario, departamento);
            indice++;
            JOptionPane.showMessageDialog(null, "Administrativo agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }

        //
        private static void listarEmpleados() {
            if (indice == 0) {
                JOptionPane.showMessageDialog(null, "No hay empleados agregados", "Información", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            StringBuilder lista = new StringBuilder("Lista de empleados:\n");

            for (int i = 0; i < indice; i++) {
                lista.append(empleados[i].obtenerInfo()).append("\n\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
        }

        // Métodos auxiliares para obtener números con validación
        private static int obtenerEntero(String mensaje) {
            while (true) {
                try {
                    return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        private static double obtenerDouble(String mensaje) {
            while (true) {
                try {
                    return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
}
