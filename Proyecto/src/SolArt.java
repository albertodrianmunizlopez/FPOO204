import javax.swing.JOptionPane;

public class SolArt {

    private String usuario;
    private String articuloSolicitado;
    private boolean estado;

    public SolArt(String usuario, String articuloSolicitado) {
        this.usuario = usuario;
        this.articuloSolicitado = articuloSolicitado;
        this.estado = false;
    }

    public void autorizarSolicitud() {
        this.estado = true;
        JOptionPane.showMessageDialog(null, "Solicitud autorizada para " + usuario);
    }

}
