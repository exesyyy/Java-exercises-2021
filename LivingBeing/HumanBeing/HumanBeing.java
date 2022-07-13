package LivingBeing.HumanBeing;

import LivingBeing.AbstractLivingBeing;

public class HumanBeing extends AbstractLivingBeing {

    private String name;
    private String surname;



    public HumanBeing(String name, String surname, int height, int weight, int age) {
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
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String born() {
        return getSurname() + ": I am born!";
    }

    @Override
    public String die() {
        return getSurname() + ": I'm dead..";
    }
}
