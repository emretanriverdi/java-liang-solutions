import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String major = scan.next();
        char maj = major.charAt(0);
        char stat = major.charAt(1);

        if ((maj == 'M' || maj == 'm' || maj == 'C' || maj == 'c' || maj == 'I' || maj == 'i') && (stat == '1' || stat == '2' || stat == '3' || stat == '4')) {
            switch (maj) {
                case 'M': System.out.print("Mathematics "); break;
                case 'C': System.out.print("Computer Science "); break;
                case 'I': System.out.print("Information Technology "); break;
            }

            switch (stat) {
                case '1': System.out.println("Freshman"); break;
                case '2': System.out.println("Sophomore"); break;
                case '3': System.out.println("Junior"); break;
                case '4': System.out.println("Senior"); break;
            }

        }
        else System.out.println("Invalid input.");

    }
}
