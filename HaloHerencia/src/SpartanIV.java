public class SpartanIV  extends Spartan{

    public SpartanIV(String nombre, int salud, int escudo,String arma){
        super(nombre,salud,2,arma);
    }

    public void usarcamuflajeActivo(){
        System.out.println("El espartan "+nombre+"tiene escudo extra y tacticas");
    }

}
