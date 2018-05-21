import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string.");
        String s1 = scan.nextLine();
        System.out.println("Enter the second string.");
        String s2 = scan.nextLine();
        String x = "";

        for (int i = 0; i < ((s1.length() > s2.length()) ? s2.length() : s1.length()); i++) {

            if (s1.charAt(i) == s2.charAt(i))
                x += s1.charAt(i);
        }
        System.out.println(x);
    }
}
