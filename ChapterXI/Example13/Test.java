package Example13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = scan.nextInt();
            list.add(a);
        }

        removeDuplicate(list);
        System.out.print(list.toString());

    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        int i = 0;
        while (i < list.size()) {
            int x = list.get(i);

            for (int j = i + 1; j < list.size(); j++)
                if (x == list.get(j))
                    list.remove(j);
            i++;
        }

    }

}
