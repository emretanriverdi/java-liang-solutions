import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int x = scan.nextInt();
        int[] array = new int[x];
        System.out.println("Enter the values: ");
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();
        if (isConsecutiveFour(array))
            System.out.println("The list has consecutive fours.");
        else System.out.println("The list has no consecutive fours.");
    }

    public static boolean isConsecutiveFour(int[] values) {

        int count = 1;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i - 1] == values[i])
                count++;

            if (count >= 4)
                return true;

            if (values[i - 1] != values[i])
                count = 1;

        }
        return false;
    }

}
