package practice.model;

public class BaseAnimal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void birth(){

        System.out.printf("Ha nacido el %s %s%n" , this.getClass().getSimpleName(), name);

    }

    public  void sound(String sound){
        System.out.printf("Yo sueno asi: %s%n", sound);
    }

    public void sound(){}
}
