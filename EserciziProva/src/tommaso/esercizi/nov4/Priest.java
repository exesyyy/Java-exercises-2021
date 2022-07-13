package tommaso.esercizi.nov4;

public class Priest extends Human {

    protected int manaPoints;

    public Priest (int _mana, int _attack, int _life) {
        manaPoints = _mana;
        this.attackPoints = _attack;
        this.lifePoints = _life;
    }

    public void heal(Priest a, Warrior b) {
        a.manaPoints -= 5;
        b.lifePoints += 15;
    }
}
