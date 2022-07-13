package tommaso.esercizi;

import java.util.concurrent.ThreadLocalRandom;

public class DuckGame {

    protected int path[] = {0,1,0,1,-1,0,0,0,0,1,
                           -1,0,0,1,-1,-2,2,5,-5,
                            3,-3,1,1,1,1,0,0,0,0};

    public String playDuckGame(Player p1, Player p2) {

        while(p1.getPosition() < path.length || p2.getPosition() < path.length) {

            int dice1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            int dice2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);

            p1.movements(dice1, path);
            p2.movements(dice2, path);
        }

        if(p1.getPosition() >= path.length) {
            return "Player " + p1.getName() + " has won the DuckGame!";
        }else{
            return "Player " + p2.getName() + " has won the DuckGame!";
        }
    }

}
