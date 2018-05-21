import java.util.Scanner;

/**
 *  Created by User on 15.12.2016.
 */
public class Example13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int x = scan.nextInt();
        System.out.println( ((((int) ((m(x) * 10000)) / 10000.0000)) + 0.0001));
    }

    public static double m(double x) {
        double sum = 0;
        for (double i = 1.0; i <= x ; i++) {
            sum += (i / (i + 1.0));
        }
        return sum;
    }
}
