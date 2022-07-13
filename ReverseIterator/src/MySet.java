import java.util.*;


// A set doesn't contain duplicate elements.

// A map is NOT under Collection, but under Iterable!
// A map has a Key and a value (K, V). Keys have no duplicate, each key is associated with a value.


// A queue is a data structure with FIFO process: First In First Out.

public class MySet<A> implements Set<A> {

    List<A> l = new ArrayList<>();

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public boolean isEmpty() {
        return l.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (A a : l) {
            if (o.equals(a)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<A> iterator() {
        return new Iterator<A>() {
            @Override
            public boolean hasNext() {
                return l.iterator().hasNext();
            }

            @Override
            public A next() {
                return l.iterator().next();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {
    }


    public static void main(String[] args) {

    }
}
