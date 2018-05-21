import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int number = input.nextInt();

        System.out.println("The character for ASCII code " + number + " is " + (char) number);
    }
}
