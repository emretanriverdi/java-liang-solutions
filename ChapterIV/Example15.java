import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = scan.next();
        char x = s.charAt(0);

        char a = Character.toUpperCase(x);

        if (Character.isLetter(a)) {
            System.out.print("The corresponding number is ");
            switch (a) {

                case 'A': System.out.print("2"); break; case 'B': System.out.print("2"); break;
                case 'C': System.out.print("2"); break; case 'D': System.out.print("3"); break;
                case 'E': System.out.print("3"); break; case 'F': System.out.print("3"); break;
                case 'G': System.out.print("4"); break; case 'H': System.out.print("4"); break;
                case 'I': System.out.print("4"); break; case 'J': System.out.print("5"); break;
                case 'K': System.out.print("5"); break; case 'L': System.out.print("5"); break;
                case 'M': System.out.print("6"); break; case 'N': System.out.print("6"); break;
                case 'O': System.out.print("6"); break; case 'P': System.out.print("7"); break;
                case 'Q': System.out.print("7"); break; case 'R': System.out.print("7"); break;
                case 'S': System.out.print("7"); break; case 'T': System.out.print("8"); break;
                case 'U': System.out.print("8"); break; case 'V': System.out.print("8"); break;
                case 'W': System.out.print("9"); break; case 'X': System.out.print("9"); break;
                case 'Y': System.out.print("9"); break; case 'Z': System.out.print("9"); break;

            }
        } else System.out.println( x + " is an invalid input");
    }

}
