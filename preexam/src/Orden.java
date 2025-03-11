import javax.swing.*;

public class Orden {

    private int cuenta;
    private int mesa;



    private String comida;

    public Orden(int cuenta, int mesa) {
        this.cuenta = cuenta;
        this.mesa = mesa;
        this.comida = comida;
    }


    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }


    public void Mostrarinfo(){
        JOptionPane.showInputDialog("Su orden f¿es de "+cuenta,"sumesa fue "+mesa);
    }



}
