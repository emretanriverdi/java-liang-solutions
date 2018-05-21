package Example7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(2);

        shuffle(list);
        System.out.println(list.toString());

    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
