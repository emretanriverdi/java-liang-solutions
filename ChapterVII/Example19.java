import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 01/01/2017.
 */
public class Example19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list: ");

        int x = scan.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length ; i++) {
            array[i] = scan.nextInt();
        }

        if (isSorted(array))
            System.out.println("The list is already sorted.");
        else System.out.println("The list is not sorted.");

    }



    public static boolean isSorted(int[] list) {

        int[] listNew = new int[list.length];

        for (int i = 0; i < list.length ; i++) {
            listNew[i] = list[i];
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length ; i++) {
            if(!(listNew[i] == list[i]))
                return false;
        }
        return true;
    }
}
