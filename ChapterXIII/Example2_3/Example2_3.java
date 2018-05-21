package Example2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by User on 26/05/2017.
 */
public class Example2_3 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(1);
        list.add(3);

        shuffle(list);

        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());

    }

    public static void shuffle(ArrayList<Number> list) {

        Collections.shuffle(list);
    }

    public static void sort(ArrayList<Number> list) {

        Number[] arr = new Number[list.size()];
        list.toArray(arr);
        Arrays.sort(arr);

        list.clear();
        Collections.addAll(list, arr);

    }

}
