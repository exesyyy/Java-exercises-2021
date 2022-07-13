package ReverseIterator;/*
    Questo terzo modo per ottenere un iteratore al contrario non si appoggia ad una struttura dati di supporto,
    ma bensì ovverida il metodo iterator utilizzando una classe che estende per esempio ArrayList.
*/


import java.util.ArrayList;
import java.util.Iterator;

public class ReverseIterator3<E> extends ArrayList<E> {

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int pos = ReverseIterator3.this.size() - 1;
            @Override
            public boolean hasNext() {
                return pos >= 0;
            }

            @Override
            public E next() {
                return ReverseIterator3.this.get(pos--);
            }
        };
    }
}
