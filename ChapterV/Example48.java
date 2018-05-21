import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = scan.nextLine();
        String result = "";
        for (int i = 0; i <= s.length(); i+=2) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
