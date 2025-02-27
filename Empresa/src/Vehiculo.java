import javax.swing.JOptionPane;

public class Vehiculo {


    private int placa;
    private String modelo;
    private int capacidadCarga;


    public Vehiculo() {
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");

        this.capacidadCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));

        this.placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del vehículo:"));
    }


    public Vehiculo(String modelo, int capacidadCarga, int placa) {
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.placa = placa;
    }


    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo +
                "\nCapacidad de Carga: " + capacidadCarga +
                "\nPlaca: " + placa);
    }

}
