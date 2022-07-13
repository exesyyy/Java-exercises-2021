//BEGIN OF EXERCISE 2
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised
            import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class two {
    /*
    class ColoreSemaforo {
        private final String colore;
        public static final ColoreSemaforo verde = new ColoreSemaforo("verde");
        public static final ColoreSemaforo giallo = new ColoreSemaforo("giallo");
        public static final ColoreSemaforo rosso = new ColoreSemaforo("rosso");
        private ColoreSemaforo(String colore) {
            this.colore=colore;
        }
    }

    class MessaggioSemaforo {
        private final String messaggio;
        public static final MessaggioSemaforo fermo = new MessaggioSemaforo("fermo");
        public static final MessaggioSemaforo parti = new MessaggioSemaforo("parti");
        public static final MessaggioSemaforo frena = new MessaggioSemaforo("frena");
        private MessaggioSemaforo(String messaggio) {
            this.messaggio=messaggio;
        }
    }

    class StatoSemaforo {
        private final String stato;
        public static final StatoSemaforo verticale = new StatoSemaforo("|");
        public static final StatoSemaforo triangolo = new StatoSemaforo("/\\");
        public static final StatoSemaforo orizzontale = new StatoSemaforo("-");
        private StatoSemaforo(String stato) {
            this.stato=stato;
        }
    }

    public interface Semaforo {

        public MessaggioSemaforo getMessaggio();
        public void moveToStop();
        public void moveToGo();
    }

    class SemaforoVeicoli implements Semaforo{

        private ColoreSemaforo status;
        private StatoSemafoto stato;

        public MessaggioSemaforo getMessaggio() {
            if(this.status == ColoreSemaforo.verde) {
                return MessaggioSemaforo.parti;
            }else if(this.status == ColoreSemaforo.giallo) {
                return MessaggioSemaforo.frena;
            }else{
                return MessaggioSemaforo.fermo;
            }
        }

        public void moveToStop() {
            if (this.stato == StatoSemaforo.verticale) {
                this.stato = StatoSemaforo.triangolo;
            }else if(this.stato == StatoSemaforo.triangolo) {
                this.stato = StatoSemaforo.orizzontale;
            }
        }

        public void moveToGo() {
            if (this.stato == StatoSemaforo.orizzontale) {
                this.stato = StatoSemaforo.triangolo;
            }else if(this.stato == StatoSemaforo.triangolo) {
                this.stato = StatoSemaforo.verticale;
            }
        }

        SemaforoVeicoli(ColoreSemaforo colore) {
            if(stato == StatoSemaforo.verticale) {
                status = ColoreSemaforo.verde;
            }else if(stato == StatoSemaforo.triangolo) {
                status = ColoreSemaforo.giallo;
            }else{
                status = ColoreSemaforo.rosso;
            }
        }


        class SemaforoTrasportoPubblico implements Semaforo {

            private StatoSemaforo stato;

            protected SemaforoTrasportoPubblico(StatoSemaforo stato) {
                this.stato = stato;
            }

            public MessaggioSemaforo getMessaggio() {
                if(this.stato == StatoSemaforo.verticale) {
                    return MessaggioSemaforo.parti;
                }else if(this.stato == StatoSemaforo.triangolo) {
                    return MessaggioSemaforo.frena;
                }else{
                    return MessaggioSemaforo.fermo;
                }
            }

            public void moveToStop() {
                if (this.stato == StatoSemaforo.verticale) {
                    this.stato = StatoSemaforo.triangolo;
                }else if(this.stato == StatoSemaforo.triangolo) {
                    this.stato = StatoSemaforo.orizzontale;
                }
            }

            public void moveToGo() {
                if (this.stato == StatoSemaforo.orizzontale) {
                    this.stato = StatoSemaforo.triangolo;
                }else if(this.stato == StatoSemaforo.triangolo) {
                    this.stato = StatoSemaforo.verticale;
                }
            }

        }
    }

    //END OF EXERCISE 2
//Please do not remove the comment above, otherwise the evaluation of your test might be compromised
    public class Solution {
        public static void main(String[] args) throws Exception {
            SemaforoVeicoli veicolifermo = new SemaforoVeicoli(ColoreSemaforo.rosso);
            SemaforoTrasportoPubblico trasportopubblicofermo = new SemaforoTrasportoPubblico(StatoSemaforo.orizzontale);
            SemaforoVeicoli veicolifrena = new SemaforoVeicoli(ColoreSemaforo.giallo);
            SemaforoTrasportoPubblico trasportopubblicofrena = new SemaforoTrasportoPubblico(StatoSemaforo.triangolo);
            SemaforoVeicoli veicoliparti = new SemaforoVeicoli(ColoreSemaforo.verde);
            SemaforoTrasportoPubblico trasportopubblicoparti = new SemaforoTrasportoPubblico(StatoSemaforo.verticale);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            switch(Integer.valueOf(line)) {
                case 1:
                    if(MessaggioSemaforo.fermo!=veicolifermo.getMessaggio())
                        System.out.println("Il semaforo per veicoli non da' messaggio di fermo quando e' rosso");
                    break;
                case 2:
                    if(MessaggioSemaforo.fermo!=trasportopubblicofermo.getMessaggio())
                        System.out.println("Il semaforo per trasporto pubblico non da' messaggio di fermo quando e' orizzontale");
                    break;
                case 3:
                    if(MessaggioSemaforo.frena!=veicolifrena.getMessaggio())
                        System.out.println("Il semaforo per veicoli non da' messaggio di frenata quando e' giallo");
                    break;
                case 4:
                    if(MessaggioSemaforo.frena!=trasportopubblicofrena.getMessaggio())
                        System.out.println("Il semaforo per trasporto pubblico non da' messaggio di fermo quando e' triangolo");
                    break;
                case 5:
                    if(MessaggioSemaforo.parti!=veicoliparti.getMessaggio())
                        System.out.println("Il semaforo per veicoli non da' messaggio di partire quando e' verde");
                    break;
                case 6:
                    if(MessaggioSemaforo.parti!=trasportopubblicoparti.getMessaggio())
                        System.out.println("Il semaforo per trasporto pubblico non da' messaggio di partire quando e' verticale");
                    break;
            }
        }
    }

}
*/
}