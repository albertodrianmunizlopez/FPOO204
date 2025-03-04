public class Spartan extends Soldado{

    private int escudo;

    public Spartan(String nombre, int salud, int escudo,String arma){
                super(nombre,salud,arma);
                this.escudo = escudo;
    }

    public void recargarEscudo(){
        escudo = 100;
        System.out.println("El espartan "+nombre +"Recargo su escudo al maximo");
    }

    @Override
    public void recibirDano(int dano){
        if(escudo > 0){
            escudo -= dano;
            if(escudo <0){
                salud += escudo;
                escudo = 0;

            }
            System.out.println("El espartan "+nombre +"recibio daño, escudo"+escudo+"salud"+salud);

        }else{
            super.recibirDano(dano);
        }
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: "+this.escudo);
    }
}
