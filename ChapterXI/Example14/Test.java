package Example14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = scan.nextInt();
            list1.add(a);
        }

        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int c = scan.nextInt();
            list2.add(c);
        }

        ArrayList<Integer> unioned = union(list1, list2);
        System.out.println("The combined list is " + unioned.toString());

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;
    }

}
