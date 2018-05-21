import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int sortedArray[] = array.clone();
        Arrays.sort(sortedArray);

        while (!(isSorted(sortedArray,array))) {
            int temp;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }

        System.out.println("The bubble-sorted array is: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
    }


        public static boolean isSorted(int[] x, int[] y) {

        boolean sorted = true;
        for (int i = 0; i < x.length ; i++) {
            if (x[i] != y[i])
                sorted = false;
        }
        return sorted;
    }
}
