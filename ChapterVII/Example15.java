import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        int[] array = eliminateDuplicates(numbers);

        for(int n: array) {
            if (!(n == 0))
                System.out.print(n + " ");
        }

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] array = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            if(isNew(array, list[i]))
                array[i] = list[i];
        }
        return array;
    }

    public static boolean isNew(int[] numbers, int n) {
        for (int i : numbers)
            if (i == n)
                return false;
        return true;
    }
}
