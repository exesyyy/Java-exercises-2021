import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,10));
        System.out.println(ListUtils.sum(l));

        ListUtils.filter(l, value -> value % 2 != 0);

        System.out.println(l);


        BinaryTree<Integer> root = new BinaryTree<>(
                new BinaryTree<>(
                        new BinaryTree<>(-1),
                        5,
                        new BinaryTree<>(23)
                ),
                51,
                new BinaryTree<>(78)
        );

    }
}
