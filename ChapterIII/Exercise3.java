import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */

// TODO: x = (ed - bf) / (ad - bc)   y = (af - ec) / (ad - bc)


public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a, b, c, d, e, f:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0)
            System.out.println("The equation has no solution.");
        else
            System.out.println("x is " + x + " and y is " + y);
    }
}
