package Example14;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 *  Created by User on 22/05/2017.
 */
public class MyDate {
    int year, month, day;

    public MyDate() {

        String x = String.valueOf(LocalDate.now());

        String year = "";
        String month = "";
        String day = "";

        year += x.charAt(0);
        year += x.charAt(1);
        year += x.charAt(2);
        year += x.charAt(3);

        month += x.charAt(5);
        month += x.charAt(6);

        day += x.charAt(8);
        day += x.charAt(9);

        this.year = Integer.parseInt(year);
        this.month = (Integer.parseInt(month) - 1);
        this.day = Integer.parseInt(day);

    }

    public MyDate(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime) {

        setDate(elapsedTime);

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return day + "-" + (month + 1) + "-" + year;
    }

}
