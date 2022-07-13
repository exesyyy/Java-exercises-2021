package LivingBeing.Animal;

import LivingBeing.AbstractLivingBeing;

import java.util.ArrayList;

public class Animal extends AbstractLivingBeing {


    private String name;
    //private ArrayList<Animal> animalKilled;

    public Animal(String name, int height, int weight, int age) {
        super();

        if(age < 0){
            throw new IllegalArgumentException("Age can't be negative.");
        }

        if(height < 0){
            throw new IllegalArgumentException("Age can't be negative.");
        }

        if(weight < 0){
            throw new IllegalArgumentException("Age can't be negative.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String born() {
        return getName() + ": I am born!";
    }

    @Override
    public String die() {
        return getName() + ": I'm dead..";
    }

    public String fight(Animal a2) {

        if(this.getWeight() >= a2.getWeight()) {
            return this.getName() + ": I won";
        }else{
            return a2.getName() + ": I won";
        }
    }





}
