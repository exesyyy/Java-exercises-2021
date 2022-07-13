package tommaso.esercizi.nov1;

public class Cane extends Animale {

    public Cane() {
        super();
    }

    public Cane(int nArti) {
        super(nArti);
        if(nArti > 4) {
            throw new ArtiException("Cane con più di 4 arti non può esistere");
        }
    }

    public void abbaia() {
        System.out.println("Bau bau");
    }

    @Override
    public void setNArti(int nArti) {
        if(nArti > 4) {
            throw new ArtiException("Cane con più di 4 arti non può esistere");
        }
        super.setNArti(nArti);
    }
}
