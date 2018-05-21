import java.util.Scanner;

/**
 *  Created by User on 24.12.2016.
 */
public class Example35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = scan.nextDouble();
        System.out.println("The area of the pentagon is " + area(s));
    }


    public static double area(double side) {
        return ((5 * side * side)) / (4.0 * Math.tan(Math.PI / 5));
    }
}
