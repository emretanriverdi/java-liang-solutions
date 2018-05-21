import java.util.Scanner;

/**
 *  Created by User on 01/01/2017.
 */
public class Example8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten double values: ");
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(average(array));

    }


    public static int average(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count / array.length;
    }

    public static double average(double[] array) {
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count / array.length;
    }
}
