//BEGIN OF EXERCISE 3
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class three {

    static class MessaggioSemaforo {

        private final String messaggio;
        public static final MessaggioSemaforo fermo = new MessaggioSemaforo("fermo");
        public static final MessaggioSemaforo  parti = new MessaggioSemaforo("parti");
        public static final MessaggioSemaforo frena = new MessaggioSemaforo("frena");
        private MessaggioSemaforo(String messaggio) {
            this.messaggio=messaggio;
        }
    }

    interface Semaforo {

        public void moveToStop();
        public void moveToGo();
        public MessaggioSemaforo getMessaggio();
    }


    static class GestoreIncrocio {
        final Semaforo sinistra, destra, sopra, sotto;
        public GestoreIncrocio(Semaforo sinistra, Semaforo destra, Semaforo sopra, Semaforo sotto) {
            this.sinistra = sinistra;
            this.destra = destra;
            this.sopra = sopra;
            this.sotto = sotto;
        }

    }

//END OF EXERCISE 3
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised


    static class FakeSemaforo implements Semaforo {
        private MessaggioSemaforo messaggio = MessaggioSemaforo.fermo;
        public MessaggioSemaforo getMessaggio() {
            return messaggio;
        }

        public void moveToGo() {
            messaggio = MessaggioSemaforo.parti;
        }

        public void moveToStop() {
            messaggio = MessaggioSemaforo.fermo;
        }
    }
/*
    public static class Solution {
        public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            GestoreIncrocio gestore = new GestoreIncrocio(
                    new FakeSemaforo(),
                    new FakeSemaforo(),
                    new FakeSemaforo(),
                    new FakeSemaforo());
            switch(Integer.valueOf(line)) {
                case 1 : gestore.scorrimentoOrizzontale();
                    if(gestore.sinistra.getMessaggio()!=MessaggioSemaforo.parti ||
                            gestore.destra.getMessaggio()!=MessaggioSemaforo.parti )
                        System.out.println("Semaforo destro o sinistro con messaggio errato quando e' in atto lo scorrimento orizzontale");
                    break;
                case 2: gestore.scorrimentoVerticale();
                    if(gestore.sinistra.getMessaggio()!=MessaggioSemaforo.fermo ||
                            gestore.destra.getMessaggio()!=MessaggioSemaforo.fermo )
                        System.out.println("Semaforo destro o sinistro con messaggio errato quando e' in atto lo scorrimento verticale");

                    break;
                case 3 : gestore.scorrimentoOrizzontale();
                    if(gestore.sopra.getMessaggio()!=MessaggioSemaforo.fermo ||
                            gestore.sotto.getMessaggio()!=MessaggioSemaforo.fermo )
                        System.out.println("Semaforo sopra o sotto con messaggio errato quando e' in atto lo scorrimento orizzontale");

                    break;
                case 4: gestore.scorrimentoVerticale();
                    if(gestore.sopra.getMessaggio()!=MessaggioSemaforo.parti ||
                            gestore.sotto.getMessaggio()!=MessaggioSemaforo.parti )
                        System.out.println("Semaforo sopra o sotto con messaggio errato quando e' in atto lo scorrimento verticale");
                    break;
                case 5: gestore.scorrimentoVerticale();
                    try {
                        gestore.scorrimentoVerticale();
                        System.out.println("Quando su un incrocio con scorrimento verticale gia' in atto si invoca nuovamente lo scorrimento verticale, cio' non causa una IncrocioException");
                    }
                    catch(IncrocioException e) {}
                    break;
                case 6: gestore.scorrimentoOrizzontale();
                    try {
                        gestore.scorrimentoOrizzontale();
                        System.out.println("Quando su un incrocio con scorrimento verticale gia' in atto si invoca nuovamente lo scorrimento verticale, cio' non causa una IncrocioException");
                    }
                    catch(IncrocioException e) {}
                    break;
            }
        }
    }

 */
}
