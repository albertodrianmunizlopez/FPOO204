
public class Main {
    public static void main(String[] args) {

        SpartanII jefeMaestro = new SpartanII("John",100,0,"Rifle de asalto");
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarcamuflajeActivo();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();


        System.out.println("");

         SpartanIII  joven = new SpartanIII("Perez",0,0,"Cuchillo");
         joven.mostrarInfo();
         joven.usarcamuflajeActivo();
         joven.atacar("Rodriigo");
         joven.recibirDano(100);
         joven.recargarEscudo();

         SpartanIV mago = new SpartanIV("Alberto",50,10,"Sable de luz");
         mago.mostrarInfo();
         mago.usarcamuflajeActivo();
         mago.atacar("Betito");
         mago.recibirDano(50);
         mago.recargarEscudo();

    }
}