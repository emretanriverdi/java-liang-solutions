import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scan.nextInt();
        System.out.print("\nEnter month:");
        int month = scan.nextInt();
        System.out.print("\nEnter the day of the month:");
        int day = scan.nextInt();

        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14; year--; }

        int k = year % 100;
        int h = ((day + ((( 26 * (month + 1)) / 10) + k + (k / 4) + (year / 400) + (5 * year / 100))) % 7);

        System.out.print("\n\n\nDay of the week is ");

        switch (h) {
            case 0: System.out.print("Saturday."); break;
            case 1: System.out.print("Sunday."); break;
            case 2: System.out.print("Monday."); break;
            case 3: System.out.print("Tuesday."); break;
            case 4: System.out.print("Wednesday."); break;
            case 5: System.out.print("Thursday."); break;
            case 6: System.out.print("Friday."); break;


        }

    }
}
