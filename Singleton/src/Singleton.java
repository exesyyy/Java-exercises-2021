public class Singleton {


    //Il singleton è un design pattern della programmazione ad oggetti che permette di istanziare una classe una volta sola.
    //Questo si fa mettendo il costruttore private, e facendolo chiamare da un metodo statico pubblico che prima di tutto controlla
    //il campo statico instance. Se entra nell'if significa che non è mai stato creato un oggetto Singleton, se è già avvenuto invece ritorna
    //sempre la stessa istanza.



    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton createSingletopn() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }



    public static void main(String[] args) {


        //si può chiamare più volte questo metodo statico, tuttavia restituisce sempre lo stesso oggetto, grazie al controllo
        //fatto instance == null.

        Singleton s = Singleton.createSingletopn();




        //la new ritorna sempre un oggetto diverso, non da errore perchè il main è nello stesso file del Singleton,
        //il costruttore essendo private dovrebbe generare un errore perchè non è chiamabile.

        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();
        Singleton s3 = new Singleton();
    }
}
