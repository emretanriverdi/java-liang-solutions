import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Enter v0, vi and t: ");
        Scanner scan = new Scanner(System.in);
        double v0 = scan.nextDouble();
        double vi = scan.nextDouble();
        double t = scan.nextDouble();
        System.out.println("The average acceleration is " + (float) ((vi - v0) / t));
    }
}
