import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        System.out.println("Is " + input + " divisible by 5 and 6 ? " + (input % 5 == 0 && input % 6 == 0));
        System.out.println("Is " + input + " divisible by 5 or 6 ? " + (input % 5 == 0 || input % 6 == 0));
        System.out.println("Is " + input + " divisible by 5 or 6, but not both ? " + (input % 5 == 0 ^ input % 6 == 0));
    }
}
