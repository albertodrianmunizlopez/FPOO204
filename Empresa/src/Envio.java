
import javax.swing.JOptionPane;

public class Envio {

    private int codigoEnvio;
    private String destino;
    private int peso;

    public Envio(int codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }


    public Envio(int codigoEnvio, String destino, int peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }


    public int getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(int codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public static Envio crearEnvio() {
        String codigoStr = JOptionPane.showInputDialog("Introduce el código de envío:");
        int codigoEnvio = Integer.parseInt(codigoStr);

        String destino = JOptionPane.showInputDialog("Introduce el destino:");

        String pesoStr = JOptionPane.showInputDialog("Introduce el peso (deja en blanco si no aplica):");
        int peso = pesoStr.isEmpty() ? 0 : Integer.parseInt(pesoStr);

        if (peso == 0) {
            return new Envio(codigoEnvio, destino);
        } else {
            return new Envio(codigoEnvio, destino, peso);
        }
    }

}
