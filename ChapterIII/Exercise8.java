import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three integers.");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("The numbers with a non-decreasing order is: " + x + " " + y + " " + z);

    }
}