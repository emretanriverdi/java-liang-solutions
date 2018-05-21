package Example3_4_5;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 *  Created by User on 06/04/2017.
 */
public class TestGregorianCalendar {
    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.print(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + ".");
        System.out.print(LocalDate.now().getMonthValue() + ".");
        System.out.print(gregorianCalendar.get(GregorianCalendar.YEAR));

        System.out.println("\n" + LocalDate.now());

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println("\n");

        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.get(GregorianCalendar.MONTH) + 1);
        System.out.println(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
