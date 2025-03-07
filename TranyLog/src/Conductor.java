import javax.swing.*;

public class Conductor extends Empleado {

        private String licencia;

        public Conductor(String nombre, int id, double salario, String licencia) {
            super(nombre, id, salario);
            this.licencia = licencia;
        }

        @Override
        public String obtenerInfo() {
            return super.obtenerInfo() + "\nLicencia: " + licencia;
        }

    @Override
    public void obtenernfo() {

    }
}

