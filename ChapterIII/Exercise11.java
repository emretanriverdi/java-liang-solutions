import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year and the month.");
        int year = scan.nextInt();
        String month = scan.next();

        if (month.equals("January")  ||  month.equals("january")  ||  month.equals("March")  ||  month.equals("march")  ||  month.equals("May")  ||  month.equals("may")  ||  month.equals("July")  ||  month.equals("july")  ||  month.equals("August")  ||  month.equals("august")  ||  month.equals("October")  ||  month.equals("october")  ||  month.equals("December")  ||  month.equals("december"))
            number = 31;

        if (month.equals("April")  ||  month.equals("april")  ||  month.equals("June")  ||  month.equals("june")  ||  month.equals("September")  ||  month.equals("september")  ||  month.equals("November")  ||  month.equals("november"))
            number = 30;

        if (month.equals("February") || month.equals("february")) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                number = 29;
            } else
                number = 28;
        }

        System.out.println(month + " " + year + " has " + number + " days.");

    }
}
