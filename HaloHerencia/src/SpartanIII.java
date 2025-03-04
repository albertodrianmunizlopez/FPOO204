public class SpartanIII extends Spartan {

    public SpartanIII(String nombre, int salud, int escudo,String arma){
        super(nombre,salud,5,arma);

    }

    public void usarcamuflajeActivo(){
        System.out.println("El espartan "+nombre+"tiene escudo extra y tacticas");
    }
}
