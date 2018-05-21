import java.util.Scanner;

/**
 *  Created by User on 26.12.2016.
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten integers: ");

        int[] array = new int[10];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = scan.nextInt();
        }

        for (int n : array)
            System.out.print(n + " ");
    }
}
