import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Enter a string.");
        String s = scan.next();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
