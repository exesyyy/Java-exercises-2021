package tommaso.esercizi.nov4;

import java.util.Random;

public class Ghoul extends Undead {

    public Ghoul(int _attack, int _life) {
        this.attackPoints = _attack;
        this.lifePoints = _life;
    }

    public void bite(Ghoul g, Warrior w) {

        Random rand = new Random();
        int upperbound = 25;
        int random = rand.nextInt(upperbound);

        //se il numero generato è pari allora l'attacco aumenta di 3 unità
        if(random % 2 == 0) {
            w.lifePoints -= (g.attackPoints + 3);
        }else{
            w.lifePoints -= g.attackPoints;
        }
    }
}
