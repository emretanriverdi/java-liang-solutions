/**
 *  Created by User on 15.12.2016.
 */
public class Example15 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020 ; i++) {
            System.out.print(numberOfDaysInAYear(i) + " ");
        }
    }


    public static int numberOfDaysInAYear(int year) {
        if (isLeapYear(year))
            return 366;

        else return 365;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else return false;

    }
}
