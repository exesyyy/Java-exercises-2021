package tommaso.esercizi.nov4;

import java.util.Random;

public class Warrior extends Human {

    private boolean Medal;

    public Warrior(boolean _medal, int _attack, int _life) {
        Medal = _medal;
        this.attackPoints = _attack;
        this.lifePoints = _life;
    }

    public void hit(Warrior a, Undead b) {

        if(a.Medal == true) {
            a.attackPoints += 5;
        }

        Random rand = new Random();
        int upperbound = 25;
        int random = rand.nextInt(upperbound);

        //se il numero generato è pari allora l'attacco aumenta di 3 unità
        if(random % 2 == 0) {
            b.lifePoints -= (a.attackPoints + 3);
        }else{
            b.lifePoints -= a.attackPoints;
        }
    }


}
