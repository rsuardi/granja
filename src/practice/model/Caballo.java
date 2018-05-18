package practice.model;

import practice.practice.model.interfaces.ICaballo;

public class Caballo extends BaseAnimal {

    public Caballo(String name){
        this.setName(name);
    }

    @Override
    public void sound(String sound){
        System.out.printf("%s%n",sound);
    }

    public void sound(){
        System.out.println("iiiiii iiiii");
    }
}
