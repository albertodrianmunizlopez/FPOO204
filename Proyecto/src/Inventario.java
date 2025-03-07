import javax.swing.JOptionPane;

public class Inventario {

    private Articulo  articulo;

    public void agregarArticulo(String nombre, int cantidad) {
        articulo = new Articulo(nombre, cantidad);
        JOptionPane.showMessageDialog(null, "Artículo agregado con éxito.");
    }

    public void consultarStock() {
        if (articulo != null) {
            String mensaje = "Stock de artículos:\n" + articulo.getNombre() + ": " + articulo.getCantidadDisponible();
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No hay artículos en el inventario.");
        }
    }

}
