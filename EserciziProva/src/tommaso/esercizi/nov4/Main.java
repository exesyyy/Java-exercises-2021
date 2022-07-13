package tommaso.esercizi.nov4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior(true, 10, 150);
        Priest p = new Priest(100, 5, 50);

        Ghoul g = new Ghoul(7, 120);
        Banshee b = new Banshee(120, 5, 40);

        for(int i = 0; i < 10; i++) {
            Random rand = new Random();
            int upperbound = 25;
            int random = rand.nextInt(upperbound);

            if(random % 2 == 0) {
                b.boostUndead(b, g);
                w.hit(w, g);
                g.bite(g, w);
                p.heal(p, w);
            }else{
                w.hit(w, g);
                g.bite(g, w);
                b.heal(b, g);
                p.heal(p, w);
            }
        }
        if(w.lifePoints > g.lifePoints) {
            System.out.println("HUMANS WINS THE BATTLE!");
        }else{
            System.out.println("UNDEADS WINS THE BATTLE!");
        }
    }
}
