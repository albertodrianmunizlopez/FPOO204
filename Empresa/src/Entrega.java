

import javax.swing.JOptionPane;

public class Entrega {


    private int numeroGuia;
    private String estado;


    public Entrega(int numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente"; // Estado por defecto
    }


    public int getNumeroGuia() {
        return numeroGuia;
    }


    public String getEstado() {
        return estado;
    }


    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Introduce el nuevo estado (En tránsito/Entregado):");


        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Intenta nuevamente.");
        }
    }


}
