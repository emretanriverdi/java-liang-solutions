import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter a number in pounds.");
        Scanner scan = new Scanner(System.in);
        double pounds = scan.nextDouble();
        System.out.println(pounds + " is " + (pounds * 0.454) + " kilograms");
    }
}
