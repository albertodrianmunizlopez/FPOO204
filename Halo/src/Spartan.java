
public class Spartan {
    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;


    public Spartan(String armaPrincipal, int escudo, String nombre, int salud) {
        this.armaPrincipal = armaPrincipal;
        this.escudo = escudo;
        this.nombre = nombre;
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }


    //Metodo Spartan
    public void mostrarInfo(){
        System.out.println("------ Informacion del sartan");
        System.out.println("Nombre"+nombre);
        System.out.println("Salud "+ salud);
        System.out.println("Escudo"+ escudo);
        System.out.println("armaPrincipal"+ armaPrincipal);
        System.out.println("-----------");
    }

    public void atacar(String enemigo){
        System.out.println(nombre+"ataca"+enemigo+"con"+armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma"+armaPrincipal+"tiene"+ total + "balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El spartan"+nombre+"esta corriendo");
        }else{
            System.out.println("El spartan"+nombre+"se detuvo");
        }
    }
    private void consultaCortana(){
        System.out.println("Conversacion privada ");
    }
}
