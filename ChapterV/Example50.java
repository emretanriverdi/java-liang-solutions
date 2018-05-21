import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = scan.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
