import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double discriminant = (Math.pow(b, 2) - 4 * a * c);
        if (discriminant < 0)
            System.out.println("The equation has no real roots.");

        double root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
        double root2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        if (discriminant == 0)
            System.out.println("The equation has one root" + root1 );

        if (discriminant > 0)
            System.out.printf("\nThe equation has two roots " + ((int) (root1 * (1000000)) / 1000000.0 + " and " + ((int) (root2 * 1000000)) / 1000000.0));
    }
}
