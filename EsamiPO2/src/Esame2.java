import javafx.scene.chart.ScatterChart;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Esame2 {


    //scorri collection applicando il primo consumer ad ogni elemento, se viene lanciata un'eccezione, applicare il secondo consumer.


    public static <A> void iter(Collection<A> c, Consumer<A> cons1, Consumer<A> cons2) {

        for(A a : c) {
           try {
               cons1.accept(a);
           }
           catch(Exception e) {

           }
           finally{
               cons2.accept(a);
           }
        }
    }



    public static <A> void iter2(Collection<A> c, Consumer<A> cons1) {

        for(A a : c) {
            cons1.accept(a);
        }
    }

    public static void increment(int a) throws IllegalArgumentException {

        try{
            int n = a * 10;
            System.out.println(n);

            

        }catch(IllegalArgumentException e) {
            System.out.println("lancio di eccezione");
        }
    }


    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        c.add(2);
        c.add(3);
        c.add(-1);
        c.add(1);

        for(Integer i : c) {
            System.out.println(i);
        }

        System.out.println("\n");

        iter2(c, Esame2::increment);
    }
}
