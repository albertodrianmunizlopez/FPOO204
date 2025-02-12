
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //Asignamos los atributos del objeto
        jefeMaestro.nombre = "John 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle e asalto";

        //Usar sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        //Asignamos Objeto Reach
        reach.nombre = "perez";
        reach.salud = 10;
        reach.escudo = 0;
        reach.armaPrincipal = "espada";

        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);


    }
}