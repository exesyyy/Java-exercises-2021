package tommaso.esercizi.nov4;

public class Banshee extends Undead {

    protected int manaPoints;

    public Banshee (int _mana, int _attack, int _life) {
        manaPoints = _mana;
        this.attackPoints = _attack;
        this.lifePoints = _life;
    }

    public void boostUndead(Banshee b, Undead u) {
        b.manaPoints -= 40;
        u.attackPoints += 20;
    }

    public void heal(Banshee b, Undead u) {
        b.manaPoints -= 5;
        u.lifePoints += 5;
    }
}
