import java.util.Collection;
import java.util.function.Supplier;



//video numero 3 delle interrogazioni su Onedrive

public class Esame {

    //funzione statica che prende una collection di A, prende un supplier di A, un int n, questo metodo popola C chiamando il supplier per n volte


    public static <A> void populateWithSupplier(Collection<A> c, Supplier<A> supplier, int n) {

        for(int i = 0; i < n; ++i) {
            c.add(supplier.get());
        }

    }






    public static class Animale implements Comparable<Animale> {

        protected int weight;

        @Override
        public int compareTo(Animale animale) {
            return this.weight - animale.weight;
        }
    }

    public static class Cane extends Animale {

        protected int eta;

        @Override
        public int compareTo(Animale animale) {

            if(animale instanceof Cane) {
                return this.eta - ((Cane) animale).eta;
            }else{
                return super.compareTo(animale);
            }
        }
    }






    public static void main(String[] args) {

    }
}
