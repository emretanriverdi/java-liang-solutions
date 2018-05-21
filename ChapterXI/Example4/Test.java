package Example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers (0 to end): ");
        ArrayList<Integer> list = new ArrayList<>();
        Integer x = Integer.valueOf(scan.next());
        while (!(x.equals(0))) {
            list.add(x);
            x = Integer.valueOf(scan.next());
        }

        System.out.println("Max is " + max(list));

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;
        else return Collections.max(list);
    }

}
