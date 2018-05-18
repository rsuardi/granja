package practice.model;

import practice.practice.model.interfaces.IPerro;

public class Perro extends BaseAnimal{

    public Perro(String name){
        this.setName(name);
    }

    @Override
    public void sound(String sound){
        System.out.printf("sdsds %s%n",sound);
    }

    public void sound(){
        System.out.println("jau jau");
    }
}
