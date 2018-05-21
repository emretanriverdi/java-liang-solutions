package Example1;

import java.time.LocalDateTime;

/**
 *  Created by User on 21/05/2017.
 */
public class Time {

    private String hour, minute, second;

    public Time() {

        String time = String.valueOf(LocalDateTime.now());

        String h = "";
        String m = "";
        String s = "";

        for (int i = 0; i < time.length(); i++)
            if (time.charAt(i) == ':') {
                h += time.charAt(i - 2);
                h += time.charAt(i - 1);
                m += time.charAt(i + 1);
                m += time.charAt(i + 2);
                s += time.charAt(i + 4);
                s += time.charAt(i + 5);

                break;
            }

        hour = h;
        minute = m;
        second = s;


    }

    public Time(long milliseconds) {

        second = String.valueOf((int) (milliseconds / 1000) % 60);
        minute = String.valueOf((int) ((milliseconds / (1000 * 60)) % 60));
        hour   = String.valueOf(((int) ((milliseconds / (1000 * 60 * 60)) % 24)) + 3);

        if (hour.equals("24"))
            hour = "00";

    }

    public Time(int h, int m, int s) {
        hour = String.valueOf(h);
        minute = String.valueOf(m);
        second = String.valueOf(s);
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        second = String.valueOf((int) (elapseTime / 1000) % 60);
        minute = String.valueOf((int) ((elapseTime / (1000 * 60)) % 60));
        hour   = String.valueOf(((int) ((elapseTime / (1000 * 60 * 60)) % 24)) + 3);

        if (hour.equals("24"))
            hour = "00";
    }

    @Override
    public String toString() {
        if (second.length() == 1)
            second = "0" + second;
        return hour + ":" + minute + ":" + second;
    }

}
