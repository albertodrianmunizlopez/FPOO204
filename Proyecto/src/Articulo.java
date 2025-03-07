import javax.swing.JOptionPane;

public class Articulo {

    private String nombre;
    private int cantidadDisponible;

    public Articulo(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void modificarCantidad(int cantidad) {
        this.cantidadDisponible = cantidad;
    }


}
