import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = scan.nextDouble();
        System.out.print("Enter miles per galloon: ");
        double milPerGal = scan.nextDouble();
        System.out.print("Enter price per galloon: ");
        double pricePerGal = scan.nextDouble();
        System.out.println("The cost of driving is $" + (float) (drivingDistance / milPerGal * pricePerGal));
    }
}
