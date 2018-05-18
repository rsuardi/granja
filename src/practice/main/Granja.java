package practice.main;
import practice.model.*;

public class Granja {



    public static void main(String [] args){
        BaseAnimal a;

        a = new Perro("firu");
        a.birth();
        a.sound();

        a = new Gato("gatico");
        a.birth();
        a.sound();

        a = new Caballo("caballito");
        a.birth();
        a.sound();
    }
}
