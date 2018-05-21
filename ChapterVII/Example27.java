import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list 1: ");
        int x = scan.nextInt();
        int[] list1 = new int[x];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.println("Enter list 2: ");
        int y = scan.nextInt();
        int[] list2 = new int[x];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = scan.nextInt();
        }

        if(equals(list1, list2))
            System.out.println("Two lists are identical.");
        else System.out.println("Two lists are not identical.");

    }

    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length)
            return false;

        Arrays.sort(list1);
        Arrays.sort(list2);

        for (int i = 0; i < list1.length ; i++)
            if ((list1[i] != list2[i]))
                return false;

        return true;
    }

}
