import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of that triangle is " + (float) area);
    }
}
