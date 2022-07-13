package tommaso.esercizi.nov1;

public class Animale {

    private int nArti;

    public Animale() {
        this.nArti = 4;
    }

    public Animale(int nArti) {
        if(nArti < 0){
            throw new ArtiException("non può avere un numero di arti negativo");
        }
        this.nArti = nArti;
    }

    public int getNArti() { //getter
        return nArti;
    }

    public void setNArti(int nArti) { //setter
        if(nArti < 0){
            throw new ArtiException("non può avere un numero di arti negativo");
        }
        this.nArti = nArti;
    }
}

