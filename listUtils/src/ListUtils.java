import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ListUtils {

    private ListUtils() {

    }

    public static int sum(List<Integer> l) {

        int sum = 0;

        for(int value : l) {
            sum += value;
        }

        return sum;
    }

    public static <T> void filter(List<T> l, Function<T, Boolean> predicate) {

        for (Iterator<T> iterator = l.iterator(); iterator.hasNext(); ) {
            T value = iterator.next();
            if (!predicate.apply(value)) {
                iterator.remove();
            }
        }
    }
}
