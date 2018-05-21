import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = scan.nextDouble();
        System.out.println(feet + " is " + (feet * 0.305) + " meters");
    }
}
