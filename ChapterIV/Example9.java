import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.println("The Unicode for the character " + ch + " is " + (int) ch);
    }
}
