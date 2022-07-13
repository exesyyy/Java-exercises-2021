package LivingBeing;

import LivingBeing.AbstractLivingBeing;
import LivingBeing.Animal.Animal;
import LivingBeing.HumanBeing.HumanBeing;

public class Main {

    public static void main(String[] args) {
        HumanBeing human1 = new HumanBeing("Tommaso", "Golfetto", 175, 58, 25);
        System.out.println(human1.born());
        System.out.println(human1.die());

        Animal a1 = new Animal("Lory", 200, 340, 5);
        Animal a2 = new Animal("Dude", 250, 100, 2);

        System.out.println(a1.fight(a2));
    }

}
