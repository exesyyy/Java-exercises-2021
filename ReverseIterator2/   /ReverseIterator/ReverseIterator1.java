package ReverseIterator;

import ReverseIterator.ReverseIterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*Il primo modo è appoggiarsi su una struttura dati per copiarsi gli elementi dell'iteratore passato in input,
questo perchè si è obbligato a scorrerlo sempre tutto.
Successivamente si ritorna tramite una anonymous class l'iteratore che itera al contrario, utilizzando una variabile di tipo int
che inizia dalla fine.
*/

public class ReverseIterator1 {

    public static <E> Iterator<E> reverseIt1(Iterator<E> it) {

        List<E> newarr = new ArrayList<>();
        while(it.hasNext()){
            newarr.add(it.next());
        }

        return new Iterator<E>() {
            private int pos = newarr.size() - 1;

            @Override
            public boolean hasNext() {
                return pos >= 0;
            }

            @Override
            public E next() {
                return newarr.get(pos--);
            }
        };
    }


    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < 10; ++i) {
            l.add(i);
        }

        Iterator<Integer> k = ReverseIterator2.reverseIt2(l.iterator());

        while(k.hasNext()) {
            System.out.println(k.next());
        }
    }
}
