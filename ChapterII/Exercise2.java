import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the radius and length of a cylinder.");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area is " + (float) area);
        System.out.println("The volume is " + (float) (area * length) );
    }
}
