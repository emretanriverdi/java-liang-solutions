import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = scan.nextLine();
        System.out.println("The sorted string is " + "\"" + sort(x) + "\"");
    }

    public static String sort(String s) {

        // There are bunch of ways but I guess this is the easiest

        char[] array = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }

        Arrays.sort(array);


        String a = "";
        for (int i = 0; i < array.length ; i++) {
            a += array[i];
        }
        return a;
    }
}
