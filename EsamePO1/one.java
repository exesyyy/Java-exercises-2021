//BEGIN OF EXERCISE 1
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class one {
    static class ColoreSemaforo {

        private final String colore;
        public static final ColoreSemaforo verde = new ColoreSemaforo("verde");
        public static final ColoreSemaforo giallo = new ColoreSemaforo("giallo");
        public static final ColoreSemaforo rosso = new ColoreSemaforo("rosso");

        private ColoreSemaforo(String colore) {
            this.colore=colore;
        }
    }

    static class SemaforoVeicoli  {
        private ColoreSemaforo status;

        public SemaforoVeicoli(ColoreSemaforo status) {
            this.status = status;
        }

        void moveToStop() {

            if(this.status == ColoreSemaforo.verde) {
                this.status = ColoreSemaforo.giallo;
            }else if(this.status == ColoreSemaforo.giallo) {
                this.status = ColoreSemaforo.rosso;
            }
        }

        void moveToGo() {

            if(this.status == ColoreSemaforo.rosso) {
                this.status = ColoreSemaforo.giallo;
            }else if(this.status == ColoreSemaforo.giallo) {
                this.status = ColoreSemaforo.verde;
            }
        }

        public ColoreSemaforo getColore() {
            return status;
        }

    }
    //END OF EXERCISE 1
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised
    public static class Solution {
        public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            SemaforoVeicoli verde = new SemaforoVeicoli(ColoreSemaforo.verde);
            SemaforoVeicoli giallo = new SemaforoVeicoli(ColoreSemaforo.giallo);
            SemaforoVeicoli rosso = new SemaforoVeicoli(ColoreSemaforo.rosso);
            switch(Integer.valueOf(line)) {
                case 1: verde.moveToStop();
                    if(ColoreSemaforo.giallo!=verde.getColore())
                        System.out.println("Quando un semaforo verde si muove verso lo stop dovrebbe andare in stato giallo");
                    break;
                case 2: giallo.moveToStop();
                    if(ColoreSemaforo.rosso!=giallo.getColore())
                        System.out.println("Quando un semaforo giallo si muove verso lo stop dovrebbe andare in stato rosso");
                    break;
                case 3: rosso.moveToStop();
                    if(ColoreSemaforo.rosso!=rosso.getColore())
                        System.out.println("Quando un semaforo rosso si muove verso lo stop dovrebbe restare in stato rosso");
                    break;

                case 4: verde.moveToGo();
                    if(ColoreSemaforo.verde!=verde.getColore())
                        System.out.println("Quando un semaforo verde si muove verso la partenza dovrebbe restare in stato verde");
                    break;
                case 5: giallo.moveToGo();
                    if(ColoreSemaforo.verde!=giallo.getColore())
                        System.out.println("Quando un semaforo giallo si muove verso la partenza dovrebbe andare in stato verde");
                    break;
                case 6: rosso.moveToGo();
                    if(ColoreSemaforo.giallo!=rosso.getColore())
                        System.out.println("Quando un semaforo rosso si muove verso la partenza dovrebbe andare in stato giallo");
                    break;

                case 7:
                    if(ColoreSemaforo.verde!=verde.getColore())
                        System.out.println("Semaforo inizializzato con verde che pero' non contiene tale stato!");
                    break;
                case 8:
                    if(ColoreSemaforo.giallo!=giallo.getColore())
                        System.out.println("Semaforo inizializzato con giallo che pero' non contiene tale stato!");
                    break;
                case 9:
                    if(ColoreSemaforo.rosso!=rosso.getColore())
                        System.out.println("Semaforo inizializzato con rosso che pero' non contiene tale stato!");
                    break;

            }
        }
    }
}
