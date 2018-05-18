package practice.model;

import practice.practice.model.interfaces.IGato;

public class Gato extends BaseAnimal {

    public Gato(String name){
        this.setName(name);
    }

    @Override
    public void sound(String sound){
        System.out.printf("%s%n",sound);
    }

    public void sound(){
        System.out.println("miau miau");
    }
}
