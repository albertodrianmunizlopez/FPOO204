import javax.swing.*;

public class Cliente {

    private String nombre;

    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarinfo(){
        JOptionPane.showInputDialog("su nombre es "+nombre);
        JOptionPane.showInputDialog("su apellido es "+apellido);
        JOptionPane.showInputDialog("su edad es "+edad);
    }



}
