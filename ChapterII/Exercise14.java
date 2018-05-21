import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.print("Enter x2 and y2:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        System.out.println("The distance between two points is " + Math.sqrt(a + b));
    }
}
