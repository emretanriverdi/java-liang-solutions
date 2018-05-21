import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = scan.nextInt();

        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;
        int firstDigit = (number / 100);

        System.out.println(number + ((lastDigit == firstDigit) ? " is a" : " is not a") + " palindrome");

    }
}
