
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan("Rifle de asalto",90,"John 117",100);
        Spartan reach = new Spartan("Aguijoneador",0,"Emile",0);


        //Usar sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);

        //ejemplo de Get & Set con el objeto jefe maestro
        jefeMaestro.setNombre("Alberto");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());



    }
}