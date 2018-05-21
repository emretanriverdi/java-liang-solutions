import java.util.Scanner;

/**
 *  Created by User on 01/01/2017.
 */
public class Example10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
        }

        System.out.println("The index of the smallest element is " + indexOfTheSmallestElement(array));

    }

    public static double findMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallestElement(double[] array) {
        for (int i = 0; i < array.length ; i++) {
            if (findMin(array) == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
