import javax.swing.JOptionPane;
import java.util.Date;

public class Autorizacion {

    private int idAutorizacion;
    private int idSolicitud;
    private String idAutorizador;
    private Date fechaAutorizacion;
    private boolean estado;

    public Autorizacion(int idAutorizacion, int idSolicitud, String idAutorizador, boolean estado) {
        this.idAutorizacion = idAutorizacion;
        this.idSolicitud = idSolicitud;
        this.idAutorizador = idAutorizador;
        this.fechaAutorizacion = new Date();
        this.estado = estado;
    }

}
