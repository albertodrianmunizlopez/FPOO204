import javax.swing.JOptionPane;

public class Conductor {

    private String nombre = "Alberto ";
    private String licencia = "Tipo B";
    private String identificacion = "Albertosss";


    public Conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }


    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre +
                        "\nIdentificación: " + identificacion +
                        "\nLicencia: " + licencia);

    }
}

