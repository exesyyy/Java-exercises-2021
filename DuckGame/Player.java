package tommaso.esercizi;

public class Player {

    private String name;
    protected int position;

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void movements(int dice, int[] path) {

        if(path[dice] == 0) {
            this.setPosition(dice);
        }else if (path[dice] < 0) {
            this.setPosition(dice - path[dice]);
        }else{
            this.setPosition(dice + path[dice]);
        }
    }

}
