import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j)
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}
