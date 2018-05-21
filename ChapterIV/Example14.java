import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String s = scan.next();
        char x = s.charAt(0);

        System.out.print("The numeric value for grade " + x + " is ");
        switch (x) {
            case 'A': System.out.println(" 4"); break;
            case 'B': System.out.println(" 3"); break;
            case 'C': System.out.println(" 2"); break;
            case 'D': System.out.println(" 1"); break;
            case 'F': System.out.println(" 0"); break;
            default: System.out.println("invalid."); break;
        }
    }
}
