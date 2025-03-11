import javax.swing.*;
import java.util.Random;

public class GeneradorMatricula {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String anioNacimiento;
    private String carrera;

    public void generarMatricula() {
        Random aleatorio = new Random();

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        apellidoPaterno = JOptionPane.showInputDialog(null, "Ingrese su apellido paterno: ");
        apellidoMaterno = JOptionPane.showInputDialog(null, "Ingrese su apellido materno: ");
        anioNacimiento = JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento: ");
        carrera = JOptionPane.showInputDialog(null, "Ingrese su carrera: ");

        String codigoCarrera = carrera.substring(0, 3);
        String anioPorDefecto = "25";
        String codigoAnio = anioNacimiento.substring(2, 4);
        String inicialNombre = nombre.substring(0, 1);
        String codigoApellidoPaterno = apellidoPaterno.substring(0, 3);
        String codigoApellidoMaterno = apellidoMaterno.substring(0, 3);
        String numerosAleatorios = (aleatorio.nextInt(50) + "" + aleatorio.nextInt(50) + aleatorio.nextInt(50));

        JOptionPane.showMessageDialog(null, codigoCarrera + anioPorDefecto + codigoAnio + inicialNombre + codigoApellidoPaterno + codigoApellidoMaterno + numerosAleatorios);
    }

    public GeneradorMatricula(String nombre, String apellidoPaterno, String apellidoMaterno, String carrera, String anioNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrera = carrera;
        this.anioNacimiento = anioNacimiento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(String anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

