import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int x = scan.nextInt();
        int[] list1 = new int[x];
        for (int i = 0; i < list1.length; i++)
            list1[i] = scan.nextInt();

        System.out.print("Enter list2: ");
        int y = scan.nextInt();
        int[] list2 = new int[y];
        for (int i = 0; i < list2.length; i++)
            list2[i] = scan.nextInt();

        for(int n : merge(list1, list2))
        System.out.print(n + " ");

    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] list3 = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }

        for (int j = list3.length - 1, i = 0; i < list2.length; j--, i++) {
            list3[j] = list2[i];
        }

        Arrays.sort(list3);

        return list3;
    }


}
