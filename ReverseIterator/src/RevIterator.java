import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RevIterator {

    public static <A> Iterator<A> reverseIterator(Iterator<A> it) {

        List<A> l = new ArrayList<>();

        while(it.hasNext()) {
            l.add(it.next());
        }

        return new Iterator<A>() {


            private int size = l.size() - 1;

            @Override
            public boolean hasNext() {

                return size > 0;
            }

            @Override
            public A next() {


                return l.get(size--);
            }
        };
    }



    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for(int i = 0; i <14; i++) {
            l.add(i);
        }

        Iterator<Integer> it = reverseIterator(l.iterator());

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
