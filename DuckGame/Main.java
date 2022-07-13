package tommaso.esercizi;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Tommy", 0);
        Player p2 = new Player("Mauro", 0);

        DuckGame duckGame = new DuckGame();

        System.out.println(duckGame.playDuckGame(p1, p2));
    }
}
