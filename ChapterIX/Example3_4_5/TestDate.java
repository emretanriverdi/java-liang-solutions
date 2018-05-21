package Example3_4_5;

import java.util.Date;

/**
 *  Created by User on 06/04/2017.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();

        long time = 10000;
        for (int i = 0; i < 7; i++, time *= 10) {
            date.setTime(time);
            System.out.println(date.toString());
        }
    }
}
