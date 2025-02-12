
public class Spartan {
    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;

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
}
