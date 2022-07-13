package ReverseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
Questo è il secondo modo e una variante del primo: ci si appoggia sempre ad una struttura dati per copiarsi gli elementi,
ma si aggiungono in coda e quindi essa risulterà già rovesciata. Infatti basta alla fine restituire l'iteratore ottenuto semplicemente.
*/

public class ReverseIterator2 {

    public static <E> Iterator<E> reverseIt2(Iterator<E> it) {

        List<E> l = new ArrayList<>();
        while(it.hasNext()) {
            l.add(0, it.next());
        }

        return l.iterator();
    }
}
