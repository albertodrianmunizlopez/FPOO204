public class SpartanII extends Spartan{

    public SpartanII(String nombre, int salud, int escudo,String arma){
        super(nombre,salud,150,arma);
    }

    public void usarcamuflajeActivo(){
        System.out.println("El espartan "+nombre+"tiene escudo extra y tacticas");
    }
}
