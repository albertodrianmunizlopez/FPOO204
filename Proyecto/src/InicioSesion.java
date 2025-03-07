import javax.swing.JOptionPane;

public class InicioSesion {

    private String usuario;
    private String contrasena;
    private String departamento;

    public InicioSesion(String usuario, String contrasena, String departamento) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.departamento = departamento;
    }

    public boolean validarCredenciales(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public String getDepartamento() {
        return departamento;
    }

}
