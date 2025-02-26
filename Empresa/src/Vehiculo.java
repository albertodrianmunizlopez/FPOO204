import javax.swing.JOptionPane;

public class Vehiculo {

    
    private int placa;
    private String modelo;
    private int CapacidadCarga;

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
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public Vehiculo(String modelo, int capacidadCarga, int placa) {
        this.modelo = modelo;
        this.CapacidadCarga = capacidadCarga;
        this.placa = placa;
    }


}
